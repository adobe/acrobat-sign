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

import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONObject;

/**
 * Encapsulates calls to REST end points related to library documents.
 */
public class RestApiLibraryDocuments {
  private static final String LIBRARY_DOCUMENTS_ENDPOINT = "/libraryDocuments";

  /**
   * Fetches the list of all library documents.
   * 
   * @param accessToken access token of the user whose library documents are to be fetched.
   * @return JSON response containing the list of all the library documents for the user.
   * @throws IOException
   */
  public static JSONObject getLibraryDocuments(String accessToken) throws Exception {
    // URL for library documents end point.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + LIBRARY_DOCUMENTS_ENDPOINT;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.CONTENT_TYPE.toString(), RestApiUtils.MimeType.JSON.toString());
    headers.put(RestApiUtils.HttpHeaderField.ACCESS_TOKEN.toString(), accessToken);

    // Invoke API and get JSON response.
    JSONObject responseJSON = null;
    responseJSON = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.GET, headers);
    
    return responseJSON;
  }

  /**
   * Fetches library documents of a non admin user by an account admin.
   * 
   * @param accessToken access token of the account admin.
   * @param emailId email ID of non admin user.
   * @return JSON response containing the list of all the library documents for the non admin user.
   * @throws IOException
   */
  public static JSONObject getLibraryDocuments(String accessToken, String emailId) throws Exception {
    // URL for Library document end point with email ID appended.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + LIBRARY_DOCUMENTS_ENDPOINT;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.CONTENT_TYPE.toString(), RestApiUtils.MimeType.JSON.toString());
    headers.put(RestApiUtils.HttpHeaderField.ACCESS_TOKEN.toString(), accessToken);
    headers.put(RestApiUtils.HttpHeaderField.USER_EMAIL.toString(), emailId);

    // Invoke API and get JSON response.
    JSONObject responseJSON = null;
    responseJSON = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.GET, headers);
    
    return responseJSON;
  }
}
