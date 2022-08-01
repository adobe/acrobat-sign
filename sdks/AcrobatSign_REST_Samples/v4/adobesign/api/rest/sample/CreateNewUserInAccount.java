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

import org.json.simple.JSONObject;

import adobesign.api.rest.sample.util.FileUtils;
import adobesign.api.rest.sample.util.RestApiOAuthTokens;
import adobesign.api.rest.sample.util.RestApiUsers;

/**
 * This sample client demonstrates how to create a new user in an account.
 * 
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the JSON files 'OAuthCredentials.json' and 'CreateUser.json' with
 * appropriate values. Which values need to be specified is indicated in the files.
 * You can also provide OAuth access token in OAUTH_ACCESS_TOKEN variable in RestApiOAuthTokens class which will then be used as OAuth access token for making api calls.
 * You can also provide refresh token in OAUTH_REFRESH_TOKEN variable in RestApiOAuthTokens class to refresh OAuth access token.
 * </p>
 */
public class CreateNewUserInAccount {

  // File containing request body to get an access token.
  private static final String authRequestJSONFileName = "OAuthCredentials.json";
  // File containing request body for creating a user.
  private final static String userRequestJSONFileName = "CreateUser.json";

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      CreateNewUserInAccount client = new CreateNewUserInAccount();
      client.run();
    }
    catch (Exception e) {
      System.err.println("Failure in creating new user into the account.");
      e.printStackTrace();
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception {
    // Get oauth access token to make further API calls.
    String accessToken = RestApiOAuthTokens.getOauthAccessToken(authRequestJSONFileName);

    // Get request JSON to create a user from the specified file.
    JSONObject requestBody = FileUtils.getRequestJson(userRequestJSONFileName);

    // Make API call to create new user
    JSONObject newUser = RestApiUsers.createUserInMyAccount(accessToken, requestBody);

    // Display user ID of newly created user.
    System.out.println("Newly created user's ID: " + newUser.get("userId"));
  }
}
