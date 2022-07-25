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
        showNextParticipantSetInfo(accessToken, agreementId);
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
  private void showNextParticipantSetInfo(String accessToken, String agreementId) throws Exception {
    // Make API call to get agreement information.
    JSONObject agreementInfo = RestApiAgreements.getAgreementInfo(accessToken, agreementId);

    // Display agreement name.
    System.out.println("AgreementName: " + agreementInfo.get("name"));

    // Retrieve nextParticipantSetList information from JSON response.
    JSONArray nextParticipantSetInfoList = (JSONArray) agreementInfo.get("nextParticipantSetInfos");
    
    if (nextParticipantSetInfoList != null && !nextParticipantSetInfoList.isEmpty()) {
      for (Object nextParticipantSetObject : nextParticipantSetInfoList) {
        if(nextParticipantSetObject != null && !nextParticipantSetInfoList.isEmpty()) {
          JSONObject nextParticipantSetJSONObject = (JSONObject)nextParticipantSetObject;
          if(nextParticipantSetJSONObject.containsKey("nextParticipantSetMemberInfos")) {
            printEachMembeOfParticipantSet((JSONArray)nextParticipantSetJSONObject.get("nextParticipantSetMemberInfos"));
          }
        }
      }
    }
    else {
      System.err.println("No next participant set information could be retrieved.");
    }
    System.out.println();
  }

  private JSONArray convertNextParticipantSetInfosJsonObjectToJsonArray(JSONObject nextParticipantSetInfoListObject ) {

    if(nextParticipantSetInfoListObject == null || nextParticipantSetInfoListObject.isEmpty() )
      return null;

    JSONArray nextParticipantSetInfoJsonArray = new JSONArray();

    for(Object key : nextParticipantSetInfoListObject.keySet()) {
      nextParticipantSetInfoJsonArray.add(nextParticipantSetInfoListObject.get(key));
    }

    return nextParticipantSetInfoJsonArray;
  }

  private void printEachMembeOfParticipantSet(JSONArray nextParticipantSet ) {

    for (Object participantObject : nextParticipantSet) {
      printParticipantObject((JSONObject)participantObject);
    }
  }

  private void printParticipantObject(JSONObject participantObject) {
    System.out.println(participantObject.toJSONString());

    if(participantObject.containsKey("email"))
      System.out.println("Email of Participant: " + participantObject.get("email"));

    if(participantObject.containsKey("name"))
      System.out.println("Name of Participant: " + participantObject.get("name"));

    if(participantObject.containsKey("waitingSince"))
      System.out.println("Waiting Since: " + participantObject.get("waitingSince"));

    System.out.println("");

  }

}
