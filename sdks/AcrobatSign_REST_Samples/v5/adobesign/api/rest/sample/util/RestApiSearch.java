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
 * Encapsulates calls to REST end points related to search of Agreement Asset Events for user.
 * It contains the utility functions which are used in file 'CreateSearchForAgreementAssetEventForUser.java' to begin the search for
 * agreement asset events for user and 'GetSearchAgreementAssetEventsForUser.java' to get the results corresponding to a page
 */
public class RestApiSearch {
  private static final String SEARCH_AGREEMENT_ASSET_EVENT_ENDPOINTS = "/search/agreementAssetEvents";

  /*
   * Used in CreateSearchForAgreementAssetEventForUser.java and GetSearchAgreementAssetEventsForUser.java to fetch the output
   * agreement asset events
   */
  public final static String EVENTS = "events";
  /*
   * Used in RestApiSearch.java and GetSearchAgreementAssetEventsForUser.java to specify the number of agreement asset events to be
   * returned in response
   */
  public final static String PAGE_SIZE = "pageSize";
  /*
   * Used in RestApiSearch.java and GetSearchAgreementAssetEventsForUser.java to specify the page cursor of the page whose agreement
   * asset events will be returned in response
   */
  public final static String PAGE_CURSOR = "pageCursor";
  /*
   * Used in RestApiSearch.java and GetSearchAgreementAssetEventsForUser.java to specify the searchId of the search object created
   * using CreateSearchForAgreementAssetEventForUser.java
   */
  public final static String SEARCH_ID = "searchId";
  
  /**
   * Get the list of all agreement asset events for a user using the GET call.
   * 
   * @param accessToken
   *          Access token of the user.
   * @param pageSize
   *          Number of agreement asset events which are returned in the response.
   * @param pageCursor
   *          Page Cursor which the user receive from either the POST /search/agreementAssetEvents request or the previous GET
   *          /search/agreementAssetEvents/{searchId} request.
   * @param searchId
   *          Search Id which uniquely identifies the search for user agreement asset event request and received from the POST
   *          /search/agreementAssetEvents request.
   * @return JSON response containing the agreement asset events specified in the page size, search Id and page cursor information.
   * @throws Exception
   */
  public static JSONObject getAgreementEventsForUser(String accessToken, int pageSize, String pageCursor, String searchId) throws Exception {

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.ACCESS_TOKEN.toString(), accessToken);

    // Adding the query parameters
    HashMap<String, String> queryParams = new HashMap<String, String>();
    queryParams.put(PAGE_CURSOR, pageCursor);
    queryParams.put(PAGE_SIZE, String.valueOf(pageSize));

    // URL to Search for Agreement Asset Event REST end point.
    String url = new StringBuilder(RestApiUtils.SERVICES_BASE_URL).append(SEARCH_AGREEMENT_ASSET_EVENT_ENDPOINTS).append("/")
        .append(searchId).toString();
    url = RestApiUtils.modifyUrlUsingQueryParams(queryParams, url);

    // Invoke API and get JSON response.
    JSONObject responseJSON = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.GET, headers);

    return responseJSON;
  }

  /**
   * Creates a search for Agreement Asset Event for a user.
   * 
   * @param accessToken
   *          Access token of the user.
   * @param requestBody
   *          Request Body in JSON format.
   * @return JSON response containing the agreement asset events specified in the page size, search Id and page cursor information
   * @throws Exception
   */
  public static JSONObject createSearchAgreementEventsForUser(String accessToken, JSONObject requestBody) throws Exception {

    // URL to Search for Agreement Asset Event REST end point.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + SEARCH_AGREEMENT_ASSET_EVENT_ENDPOINTS;

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
