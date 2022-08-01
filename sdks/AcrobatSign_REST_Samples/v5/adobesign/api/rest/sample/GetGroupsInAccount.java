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

import adobesign.api.rest.sample.util.RestApiGroups;
import adobesign.api.rest.sample.util.RestApiOAuthTokens;

/**
 * This sample client demonstrates how to get all groups in an account.
 * 
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the JSON file 'OAuthCredentials.json' with appropriate values. Which
 * values need to be specified is indicated in the file.
 * You can also provide OAuth access token in OAUTH_ACCESS_TOKEN variable in RestApiOAuthTokens class which will then be used as OAuth access token for making api calls.
 * You can also provide refresh token in OAUTH_REFRESH_TOKEN variable in RestApiOAuthTokens class to refresh OAuth access token.
 * </p>
 */
public class GetGroupsInAccount {
  //File containing request body to get an access token.
  private static final String authRequestJSONFileName = "OAuthCredentials.json";

  /**
   * Entry point for this sample client program.
   */
  public static void main(String[] args) {
    try {
      GetGroupsInAccount client = new GetGroupsInAccount();
      client.run();
    }
    catch(Exception e) {
      System.err.println("Failure in getting groups in the account.");
      e.printStackTrace();
    }

  }
  
  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception {
    // Get oauth access token to make further API calls.
    String accessToken = RestApiOAuthTokens.getOauthAccessToken(authRequestJSONFileName);

    // Make API call to get list of groups in the account.
    JSONObject groupResponse = RestApiGroups.getAllGroupsInAccount(accessToken);

    // Display group ID and group name.
    JSONArray groupList = (JSONArray) groupResponse.get("groupInfoList");
    for (Object eachGroup : groupList) {
      JSONObject group = (JSONObject) eachGroup;
      System.out.println("GroupID: " + group.get("groupId"));
      System.out.println("GroupName: " + group.get("groupName"));
      System.out.println();
    }
  }

}
