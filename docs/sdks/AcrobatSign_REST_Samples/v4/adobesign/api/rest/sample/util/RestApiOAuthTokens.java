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
 * Encapsulates calls to REST end points related to OAuth access token.
 * 
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the JSON file 'OAuthCredentials.json' with appropriate values.
 * Which values need to be specified is indicated in the file.
 * Please refer to Getting Started section of README.txt file for more details.
 * </p>
 */
public class RestApiOAuthTokens {
  private final static String OAUTH_ACCESS_TOKEN_ENDPOINT = "/token";
  private final static String OAUTH_REFRESH_TOKEN_ENDPOINT = "/refresh";
  
  /**
   * TODO: Provide an OAuth access token or integration key here. If not provided then a new OAuth access token will be requested from AdobeSign server based on
   * credentials provided in the OAuthCredentials.json file.
   * You can also provide a refresh token in OAUTH_REFRESH_TOKEN variable below to refresh the OAuth access token.
  */
  private final static String OAUTH_ACCESS_TOKEN = "";

  /**
   * TODO: Provide refresh token here. This will be used to refresh the OAuth access token.
   * If refresh token is not provided then a new OAuth access token will be generated with new refresh token.
   */
  private final static String OAUTH_REFRESH_TOKEN = "";

  /**
   * Fetches the access token for the specified user.
   * 
   * @param requestJSONFile Reference to the file containing template request JSON required for this API invocation.
   * @return access token.
   * @throws Exception
   */
  public static String getOauthAccessToken(String requestJSONFile) throws Exception {

    // If an OAuth access token is available, use that instead of requesting a new one.
    if (!OAUTH_ACCESS_TOKEN.isEmpty())
      return OAUTH_ACCESS_TOKEN;

    // Otherwise if an OAuth refresh token is available, use it to request an updated OAuth access token.
    if (!OAUTH_REFRESH_TOKEN.isEmpty())
      return getOauthAcessTokenFromRefreshToken(requestJSONFile);

    // URL for token endpoint.
    String url = RestApiUtils.OAUTH_BASE_URL + OAUTH_ACCESS_TOKEN_ENDPOINT;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.CONTENT_TYPE.toString(), RestApiUtils.MimeType.FORM.toString());

    // Get request JSON from the specified file.
    JSONObject requestBodyJson = FileUtils.getRequestJson(requestJSONFile);

    String requestBody = "code=" + requestBodyJson.get("code") +
            "&client_id="+ requestBodyJson.get("client_id") +
            "&client_secret="+ requestBodyJson.get("client_secret") +
            "&redirect_uri=" + requestBodyJson.get("redirect_uri") +
            "&grant_type=authorization_code";

    // Invoke API and get JSON response.
    JSONObject responseJSON = null;
    responseJSON = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.POST, headers, requestBody);

    // Provide this refresh token value to OAUTH_REFRESH_TOKEN static variable declared above in this class.
    // This refresh token will be used to receive an updated OAuth access token for future calls.
    System.out.println("OAuth Refresh Token : " + (String) responseJSON.get("refresh_token"));

    // Extract and return access token from the JSON response.
    return (String) responseJSON.get("access_token");

  }

  private static String getOauthAcessTokenFromRefreshToken(String requestJSONFile) throws Exception{

    // URL for refresh token end point.
    String url = RestApiUtils.OAUTH_BASE_URL + OAUTH_REFRESH_TOKEN_ENDPOINT;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.CONTENT_TYPE.toString(), RestApiUtils.MimeType.FORM.toString());

    // Get request JSON from the specified file.
    JSONObject requestBodyJson = FileUtils.getRequestJson(requestJSONFile);

    String requestBody =  "refresh_token=" + OAUTH_REFRESH_TOKEN +
            "&client_id=" + requestBodyJson.get("client_id") +
            "&client_secret=" + requestBodyJson.get("client_secret") +
            "&grant_type=refresh_token";

    // Invoke API and get JSON response.
    JSONObject responseJSON = null;
    responseJSON = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.POST, headers, requestBody);

    // Extract and return access token from the JSON response.
    String token = (String) responseJSON.get("access_token");
    System.out.println("OAuth Access Token : " + token);
    return token;

  }
}
