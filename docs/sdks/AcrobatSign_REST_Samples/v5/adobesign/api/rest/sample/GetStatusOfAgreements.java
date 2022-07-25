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
 * This sample client demonstrates how to to get status of all agreements of an account and display their agreement ID, name and status.
 * 
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the JSON file 'OAuthCredentials.json' with appropriate values. Which
 * values need to be specified is indicated in the file.
 * You can also provide OAuth access token in OAUTH_ACCESS_TOKEN variable in RestApiOAuthTokens class which will then be used as OAuth access token for making api calls.
 * You can also provide refresh token in OAUTH_REFRESH_TOKEN variable in RestApiOAuthTokens class to refresh OAuth access token.
 * </p>
 */
public class GetStatusOfAgreements {
  // File containing request body to get an access token.
  private static final String authRequestJSONFileName = "OAuthCredentials.json";

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      GetStatusOfAgreements client = new GetStatusOfAgreements();
      client.run();
    }
    catch (Exception e) {
      System.err.println("Failure in getting status of the agreements.");
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

    if (myAgreements != null) {
      // Display agreement ID, name and status of each agreement.
      JSONArray agreementList = (JSONArray) myAgreements.get("userAgreementList");
      for (Object eachAgreement : agreementList) {
        JSONObject agreement = (JSONObject) eachAgreement;
        System.out.println("AgreementName: " + agreement.get("name"));
        System.out.println("AgreementID: " + agreement.get("agreementId"));
        System.out.println("AgreementStatus: " + agreement.get("status"));
        System.out.println();
      }
    }
  }
}