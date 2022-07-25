/*************************************************************************
 * ADOBE SYSTEMS INCORPORATED
 * Copyright 2016 Adobe Systems Incorporated
 * All Rights Reserved.
 * NOTICE: Adobe permits you to use, modify, and distribute this file in accordance with the
 * terms of the Adobe license megaSign accompanying it. If you have received this file from a
 * source other than Adobe, then your use, modification, or distribution of it requires the prior
 * written permission of Adobe.
 **************************************************************************/

package adobesign.api.rest.sample;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import adobesign.api.rest.sample.util.RestApiMegaSigns;
import adobesign.api.rest.sample.util.RestApiOAuthTokens;

/**
 * This sample client demonstrates how to get status of all MegaSign parent agreements of an account and display ID of each MegaSign parent
 * agreement, name of document and current status of the MegaSign parent agreement from the user's perspective.
 * <p>
 * <b>IMPORTANT</b>
 * <ol>
 * <li>Before running this sample, check that you have modified the JSON file 'OAuthCredentials.json' with appropriate values. Which
 * values need to be specified is indicated in the file.</li>
 * <li>You can also provide OAuth access token in OAUTH_ACCESS_TOKEN variable in RestApiOAuthTokens class which will then be used as OAuth access
 * token for making API calls.</li>
 * <li>You can also provide refresh token in OAUTH_REFRESH_TOKEN variable in RestApiOAuthTokens class to refresh OAuth access token.</li>
 * </ol>
 * </p>
 */
public class GetStatusOfMegaSigns {
  // File containing request body to get an access token.
  private static final String authRequestJSONFileName = "OAuthCredentials.json";

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      GetStatusOfMegaSigns client = new GetStatusOfMegaSigns();
      client.run();
    }
    catch (Exception e) {
      System.err.println("Failure in getting status of the megasign parent agreement.");
      e.printStackTrace();
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception {
    // Get OAuth access token to make further API calls.
    String accessToken = RestApiOAuthTokens.getOauthAccessToken(authRequestJSONFileName);

    // Get list of all MegaSign parent agreements of the account.
    JSONObject myMegaSigns = RestApiMegaSigns.getMyMegaSigns(accessToken);

    if (myMegaSigns != null) {
      // Display ID of MegaSign parent agreement, document name and current status for MegaSign parent agreement.
      JSONArray megaSignList = (JSONArray) myMegaSigns.get("megaSignList");
      for (Object eachMegaSign : megaSignList) {
        JSONObject megaSign = (JSONObject) eachMegaSign;
        System.out.println("MegaSignName: " + megaSign.get("name"));
        System.out.println("MegaSignID: " + megaSign.get("megaSignId"));
        System.out.println("MegaSignStatus: " + megaSign.get("status"));
        System.out.println();
      }
    }
  }
}