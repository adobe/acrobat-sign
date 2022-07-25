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

import adobesign.api.rest.sample.util.RestApiAgreements;
import adobesign.api.rest.sample.util.RestApiOAuthTokens;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * This sample client demonstrates how to to get signing url of an agreement .
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the JSON file 'OAuthCredentials.json' with appropriate values. Which
 * values need to be specified is indicated in the file.
 * You can also provide OAuth access token in OAUTH_ACCESS_TOKEN variable in RestApiOAuthTokens class which will then be used as OAuth access token for making api calls.
 * You can also provide refresh token in OAUTH_REFRESH_TOKEN variable in RestApiOAuthTokens class to refresh OAuth access token.
 *
 * Note: The access token must have agreement_write scope to run this sample.
 * </p>
 */
public class GetSigningUrlForAnAgreement {
  // TODO: Enter a valid agreement ID. Please refer to the "agreements" end-point in the API documentation to learn how to obtain IDs of
  // agreements present in Adobe Sign.
  private static String agreementId = "a valid agreement ID";

  // File containing request body to get an access token.
  private static final String authRequestJSONFileName = "OAuthCredentials.json";

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      GetSigningUrlForAnAgreement client = new GetSigningUrlForAnAgreement();
      client.run();
    }
    catch (Exception e) {
      System.err.println("Failure in getting signing urls of the agreement.");
      e.printStackTrace();
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception {
    // Get oauth access token to make further API calls.
    String accessToken = RestApiOAuthTokens.getOauthAccessToken(authRequestJSONFileName);

    // Display name of the agreement associated with the specified agreement ID.
    JSONObject agreementInfo = RestApiAgreements.getAgreementInfo(accessToken, agreementId);
    String agreementName = (String) agreementInfo.get("name");
    System.out.println("Agreement name: " + agreementName);

    System.out.println("Fetching signing url");

    JSONObject response = RestApiAgreements.getSigningUrl(accessToken, agreementId);

    if(response != null) {
      JSONArray signingUrlSetInfos = (JSONArray) response.get("signingUrlSetInfos");
      for (Object eachSigningUrlSet : signingUrlSetInfos) {
        JSONObject signingUrlSetInfo = (JSONObject)eachSigningUrlSet;
        JSONArray signingUrls = (JSONArray) signingUrlSetInfo.get("signingUrls");

        // Display signing url along with signer email.
        for(Object eachSigningUrl : signingUrls) {
          JSONObject signingUrl = (JSONObject) eachSigningUrl;
          System.out.print("Signer Email: " + signingUrl.get("email") + ", ");
          System.out.println("Signing Url: " + signingUrl.get("esignUrl"));
          System.out.println();
        }

      }

    }
    else {
      System.out.println("API User is not the current signer or sender of agreement: " + agreementName);
    }
  }
}