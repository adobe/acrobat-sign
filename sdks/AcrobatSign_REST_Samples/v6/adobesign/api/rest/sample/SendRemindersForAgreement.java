/*************************************************************************
 * ADOBE SYSTEMS INCORPORATED
 * Copyright 2018 Adobe Systems Incorporated
 * All Rights Reserved.
 *
 * NOTICE: Adobe permits you to use, modify, and distribute this file in accordance with the
 * terms of the Adobe license agreement accompanying it. If you have received this file from a
 * source other than Adobe, then your use, modification, or distribution of it requires the prior
 * written permission of Adobe.
 **************************************************************************/

package adobesign.api.rest.sample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import adobesign.api.rest.sample.util.RestApiAgreements;
import adobesign.api.rest.sample.util.RestApiOAuthTokens;
import adobesign.api.rest.sample.util.RestError;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
 *
 * Note: The access token must have agreement_write scope to run this sample.
 * </p>
 */
public class SendRemindersForAgreement {
  // TODO: Enter a valid agreement ID. Please refer to the "agreements" end-point in the API documentation to learn how to obtain IDs of agreements present in Adobe Sign.
  private static String agreementId = "";

  // JSON resource file used to obtain an access token.
  private static final String authRequestJsonFileName = "OAuthCredentials.json";

  // JSON resource file used to specify the agreement for which to send reminders.
  private final static String sendReminderJsonFileName = "SendReminder.json";

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      SendRemindersForAgreement client = new SendRemindersForAgreement();
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

    // Display name of the agreement associated with the specified agreement ID.
    JSONObject agreement = RestApiAgreements.getAgreementInfo(accessToken, agreementId);
    String agreementName = (String) agreement.get("name");
    System.out.println("Agreement name: " + agreementName);

    sendRemindersForAgreement(accessToken, agreement, now);
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
    String agreementId = (String) agreement.get("id");
    JSONArray nextParticipantList = getNextParticipantInfos(accessToken, agreementId);
    if (nextParticipantList == null)
      return;

    // For each next/active participant, check if her waiting time exceeds the limit and if so send a reminder.
    for (Object eachNextParticipant : nextParticipantList) {
      JSONObject nextParticipant = (JSONObject) eachNextParticipant;

      JSONArray members = (JSONArray)nextParticipant.get("memberInfos");

      List<String> participantIdList = new ArrayList<String>();

      for (Object eachMember : members) {
        JSONObject member = (JSONObject)eachMember;
        participantIdList.add((String)member.get("id"));
      }

      // Time limit exceeded. Send a reminder to all active participants of the agreement.
      JSONObject reminderResponse = RestApiAgreements.sendReminder(accessToken, sendReminderJsonFileName, agreementId, participantIdList);

      // Parse and display result
      System.out.println(formatResponse(reminderResponse, agreement));

      // All relevant participants have been sent a reminder; no need to check remaining participants.
      break;
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
    JSONObject agreementInfo = RestApiAgreements.getAgreementMembers(accessToken, agreementId, true);

    // Retrieve next set of participants of this agreement.
    return (JSONArray) agreementInfo.get("nextParticipantSets");
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
        + reminderResponse.get("id") + ".";
  }
}
