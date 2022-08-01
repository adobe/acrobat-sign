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

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import adobesign.api.rest.sample.util.RestApiAgreements;
import adobesign.api.rest.sample.util.RestApiOAuthTokens;

/**
 * This sample client demonstrates how to get the next participants' information from all agreements that are out for signature.
 * 
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the JSON file 'OAuthCredentials.json' with appropriate values. Which
 * values need to be specified is indicated in the file.
 * You can also provide OAuth access token in OAUTH_ACCESS_TOKEN variable in RestApiOAuthTokens class which will then be used as OAuth access token for making api calls.
 * You can also provide refresh token in OAUTH_REFRESH_TOKEN variable in RestApiOAuthTokens class to refresh OAuth access token.
 * </p>
 */
public class GetNextParticipantInfoOfAllWaitingAgreements {
  // File containing request body to get an access token.
  private static final String authRequestJSONFileName = "OAuthCredentials.json";

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      GetNextParticipantInfoOfAllWaitingAgreements client = new GetNextParticipantInfoOfAllWaitingAgreements();
      client.run();
    }
    catch (Exception e) {
      System.err.println("Failure in getting information for your agreements");
      e.printStackTrace();
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception {
    // Get oauth access token to make further API calls.
    String accessToken = RestApiOAuthTokens.getOauthAccessToken(authRequestJSONFileName);

    // Get list of all agreements of the account.
    JSONObject myAgreements = RestApiAgreements.getMyAgreements(accessToken);

    // Get IDs of only those agreements which are in 'OUT_FOR_SIGNATURE' state and display their next participant information.
    JSONArray agreementList = (JSONArray) myAgreements.get("userAgreementList");
    for (Object eachAgreement : agreementList) {
      JSONObject agreement = (JSONObject) eachAgreement;

      if (agreement.get("status").equals("OUT_FOR_SIGNATURE")) {
        String agreementId = (String) (agreement.get("agreementId"));
        showNextParticipantInfo(accessToken, agreementId);
      }
    }
  }

  /**
   * Display information (email and waiting time) about the next set of participants in the signing process of the specified agreement.
   * 
   * @param accessToken access token of the user
   * @param agreementId agreement identifier
   * @throws Exception
   */
  private void showNextParticipantInfo(String accessToken, String agreementId) throws Exception {
    // Make API call to get agreement information.
    JSONObject agreementInfo = RestApiAgreements.getAgreementInfo(accessToken, agreementId);

    // Display agreement name.
    System.out.println("AgreementName: " + agreementInfo.get("name"));

    // Retrieve nextParticipant information from JSON response.
    JSONArray nextParticipantInfoList = (JSONArray) agreementInfo.get("nextParticipantInfos");
    
    if (nextParticipantInfoList != null && !nextParticipantInfoList.isEmpty()) {
      for (Object eachNextParticipant : nextParticipantInfoList) {
        JSONObject nextParticipant = (JSONObject) eachNextParticipant;
        System.out.println("NextParticipantEmail: " + nextParticipant.get("email"));
        System.out.println("Waiting Since: " + nextParticipant.get("waitingSince"));
      }
    }
    else {
      System.err.println("No next participant information could be retrieved.");
    }
    System.out.println();
  }
}
