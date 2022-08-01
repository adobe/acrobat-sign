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

public class RestApiGroups {
  private static final String GROUPS_ENDPOINT = "/groups";

  /**
   * Returns all groups in a account
   * 
   * @param accessToken
   *          Access Token of the user
   * @return JSON Object containing groups list
   * @throws Exception
   */
  public static JSONObject getAllGroupsInAccount(String accessToken) throws Exception {
    // URL to Groups REST end point.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + GROUPS_ENDPOINT;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.ACCESS_TOKEN.toString(), accessToken);

    // Invoke API and get JSON response.
    JSONObject responseJSON = null;
    responseJSON = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.GET, headers);

    return responseJSON;
  }

  /**
   * Creates a group in an account.
   * 
   * @param accessToken
   *          Access Token of the user.
   * @param requestBody
   *          Request body in JSON format.
   * @return JSON response containing the group creation message.
   * @throws Exception
   */
  public static JSONObject createGroupInAccount(String accessToken, JSONObject requestBody) throws Exception {
    // URL to Groups REST end point.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + GROUPS_ENDPOINT;

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
