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

package adobesign.api.rest.sample.util;

import java.util.HashMap;

import org.json.simple.JSONObject;

/**
 * Encapsulates calls to REST end points related to user.
 */
public class RestApiUsers {
  private static final String USERS_ENDPOINT = "/users";

  /**
   * Get the list of all users in an account.
   * 
   * @param accessToken Access token of the user.
   * @return JSON response containing the user information.
   * @throws Exception
   */
  public static JSONObject getAllUsersOfMyAccount(String accessToken) throws Exception {
    // URL to Users REST end point.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + USERS_ENDPOINT;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.ACCESS_TOKEN.toString(), accessToken);

    // Invoke API and get JSON response.
    JSONObject responseJSON = null;
    responseJSON = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.GET, headers);
    
    return responseJSON;
  }

  /**
   * Creates a user in an account.
   * 
   * @param accessToken Access token of the user.
   * @param requestBody Request body in JSON format.
   * @return JSON response containing the user creation message.
   * @throws Exception
   */
  public static JSONObject createUserInMyAccount(String accessToken, JSONObject requestBody) throws Exception {
    // URL to Users REST end point.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + USERS_ENDPOINT;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.CONTENT_TYPE.toString(), RestApiUtils.MimeType.JSON.toString());
    headers.put(RestApiUtils.HttpHeaderField.ACCESS_TOKEN.toString(), accessToken);

    // Invoke API and get JSON response.
    JSONObject responseJSON = null;
    responseJSON = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.POST, headers, requestBody.toString());
    
    return responseJSON;
  }

}
