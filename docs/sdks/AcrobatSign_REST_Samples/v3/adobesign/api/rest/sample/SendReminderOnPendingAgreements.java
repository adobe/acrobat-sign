/*************************************************************************
 * ADOBE SYSTEMS INCORPORATED
 * Copyright 2015 Adobe Systems Incorporated
 * All Rights Reserved.
 * 
 * NOTICE: Adobe permits you to use, modify, and distribute this file in accordance with the
 * terms of the Adobe license agreement accompanying it. If you have received this file from a
 * source other than Adobe, then your use, modification, or distribution of it requires the prior
 * written permission of Adobe.
 **************************************************************************/

package adobesign.api.rest.sample;

import java.util.Date;

import javax.xml.bind.DatatypeConverter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import adobesign.api.rest.sample.util.RestApiAgreements;
import adobesign.api.rest.sample.util.RestApiOAuthTokens;
import adobesign.api.rest.sample.util.RestError;

/**
 * This sample client demonstrates how to send reminders to active participants (those who are next in line in the signing process) of
 * various agreements. It retrieves all agreements of the current API user, checks which agreements are out for signature, and if any of
 * them has a participant that has not signed for longer than a specified amount of time. If the time limit has been crossed, all active
 * participants of that agreement are sent a reminder email.
 * 
 * <p>
 * <b>IMPORTANT</b>:
 * <ol>
 * <li>Before running this sample, check that you have modified the JSON files 'OAuthCredentials.json' and 'Reminder.json' with appropriate values.
 * Which values need to be specified is indicated in the files.</li>
 * <li>You can also provide OAuth access token in OAUTH_ACCESS_TOKEN variable in RestApiOAuthTokens class which will then be used as OAuth access token for making api calls.</li>
 * <li>You can also provide refresh token in OAUTH_REFRESH_TOKEN variable in RestApiOAuthTokens class to refresh OAuth access token. </li>
 * <li>The constant <code>WAITING_TIME_LIMIT</code> below determines how long a participant needs to have been waiting before a reminder
 * becomes necessary. Any suitable value can be set here.</li>
 * </p>
 */
public class SendReminderOnPendingAgreements {

  // How long a participant needs to have been waiting (in milliseconds) before we can send them a reminder.
  private static final long MILLISECS_PER_DAY = 24 * 60 * 60 * 1000;
  private static long WAITING_TIME_LIMIT = 1 * MILLISECS_PER_DAY; // one day

  // JSON resource file used to obtain an access token.
  private static final String authRequestJsonFileName = "OAuthCredentials.json";

  // JSON resource file used to specify the agreement for which to send reminders.
  private final static String sendReminderJsonFileName = "SendReminder.json";

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      SendReminderOnPendingAgreements client = new SendReminderOnPendingAgreements();
      client.run();
    }
    catch (Exception e) {
      System.err.println(RestError.SEND_REMINDER_ERROR.errMessage);
      e.printStackTrace();
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception {
    // Get the current system date.
    Date now = new Date();

    // Fetch oauth access token to make further API calls.
    String accessToken = RestApiOAuthTokens.getOauthAccessToken(authRequestJsonFileName);

    // Get all agreements owned by the current API user.
    JSONObject myAgreements = RestApiAgreements.getMyAgreements(accessToken);
    JSONArray agreementList = (JSONArray) myAgreements.get("userAgreementList");

    // For each agreement, if it is out for signature, send reminders if any.
    for (Object eachAgreement : agreementList) {
      JSONObject agreement = (JSONObject) eachAgreement;
      if (agreement.get("status").equals("OUT_FOR_SIGNATURE")) {
        sendRemindersForAgreement(accessToken, agreement, now);
      }
    }
  }

  /**
   * Sends reminders to active participants of an agreement if any of them is taking too long to sign.
   * 
   * @param accessToken Access token of the user.
   * @param agreement JSON object representing an agreement.
   * @param now Current time.
   * @throws Exception
   */
  private void sendRemindersForAgreement(String accessToken, JSONObject agreement, Date now) throws Exception {
    // For the given agreement, get the list of next (in line) participants.
    String agreementId = (String) agreement.get("agreementId");
    JSONArray nextParticipantList = getNextParticipantInfos(accessToken, agreementId);
    if (nextParticipantList == null)
      return;

    // For each next/active participant, check if her waiting time exceeds the limit and if so send a reminder.
    for (Object eachNextParticipant : nextParticipantList) {
      JSONObject nextParticipant = (JSONObject) eachNextParticipant;
      if (hasWaitingTimeExceededLimit(nextParticipant, now)) {
        // Time limit exceeded. Send a reminder to all active participants of the agreement.
        JSONObject reminderResponse = RestApiAgreements.sendReminder(accessToken, sendReminderJsonFileName, agreementId);

        // Parse and display result
        System.out.println(formatResponse(reminderResponse, agreement));

        // All relevant participants have been sent a reminder; no need to check remaining participants.
        break;
      }
    }
  }

  /**
   * Gets information about the next set of participants in the signing process of a given agreement.
   * 
   * @param accessToken Access token of the user.
   * @param agreementId ID of the agreement in question.
   * @return A JSON object containing the list of next (active) participants of this agreement.
   * @throws Exception
   */
  private JSONArray getNextParticipantInfos(String accessToken, String agreementId) throws Exception {
    // Get the agreement information.
    JSONObject agreementInfo = RestApiAgreements.getAgreementInfo(accessToken, agreementId);

    // Retrieve next set of participants of this agreement.
    return (JSONArray) agreementInfo.get("nextParticipantInfos");
  }

  /**
   * Checks whether an agreement participant has taken too long to sign the agreement.
   * 
   * @param participant The agreement participant.
   * @param now Current time.
   * @return True if the participant is taking too long.
   */
  private boolean hasWaitingTimeExceededLimit(JSONObject participant, Date now) {
    // Check how long this participant has been next in line but idle.
    String waitingSinceStr = (String) participant.get("waitingSince");

    // Extract a date from the string using the format "yyyy-MM-dd'T'HH:mm:ssZ".
    Date waitingSince = DatatypeConverter.parseDateTime(waitingSinceStr).getTime();

    // Check if waiting time exceeds given limit
    boolean timeExceeded = ((now.getTime() - waitingSince.getTime()) >= WAITING_TIME_LIMIT);
    return timeExceeded;
  }

  /**
   * Formats (for displaying) the response from the call to send reminders.
   * 
   * @param reminderResponse The response from the call to send reminders.
   * @param agreement The agreement on which the call was made.
   * @return Formatted response.
   */
  private String formatResponse(JSONObject reminderResponse, JSONObject agreement) {
    return "Sent a reminder to the next participant in line to sign the agreement '" + agreement.get("name") + "'. Result: "
           + reminderResponse.get("result") + ".";
  }
}
