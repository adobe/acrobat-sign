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

import adobesign.api.rest.sample.util.FileUtils;
import adobesign.api.rest.sample.util.RestApiOAuthTokens;
import adobesign.api.rest.sample.util.RestApiSearch;
import adobesign.api.rest.sample.util.RestApiUtils;

/**
 * This sample client builds on the BeginAgreementAssetEventsSearchForUser sample, and demonstrates how to retrieve the subsequent pages of
 * results. It corresponds to the GET /search/agreementAssetEvents/{searchId} API endpoint, and requires a search ID and the page cursor for
 * the desired next page.
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the JSON file 'OAuthCredentials.json' and
 * 'ResumeAgreementAssetEventsSearchForUser.json' with appropriate values. These values need to be specified as indicated in the file.
 * </p>
 */
public class GetSearchAgreementAssetEventsForUser {
  // File containing request body to get an access token.
  private static final String authRequestJSONFileName = "OAuthCredentials.json";

  // File containing the request parameters required to make the API call
  private final static String searchRequestJSONFileName = "ResumeAgreementAssetEventsSearchForUser.json";

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      GetSearchAgreementAssetEventsForUser client = new GetSearchAgreementAssetEventsForUser();
      client.run();
    }
    catch (Exception e) {
      System.err.println("Failure in getting details of agreement events for the user using Page Cursor.");
      e.printStackTrace();
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception {

    // Get access token to make further API calls.
    String accessToken = RestApiOAuthTokens.getOauthAccessToken(authRequestJSONFileName);

    // Get JSON containing the request parameters which are required for making the API call.
    JSONObject requestParameters = FileUtils.getRequestJson(searchRequestJSONFileName);

    // Getting the search Id and associated arguments for the GET /search/agreementAssetEvents/{searchId} API call
    String searchId = requestParameters.get(RestApiSearch.SEARCH_ID).toString();
    int pageSize = Integer.valueOf(requestParameters.get(RestApiSearch.PAGE_SIZE).toString());
    String pageCursor = requestParameters.get(RestApiSearch.PAGE_CURSOR).toString();

    // Make API call to get the next set of search results for the specified search ID.
    JSONObject agreementAssetEventResponse = RestApiSearch.getAgreementEventsForUser(accessToken, pageSize, pageCursor, searchId);

    // Display agreement asset events for the given page.
    JSONArray agreementAssetEventList = (JSONArray) agreementAssetEventResponse.get(RestApiSearch.EVENTS);
    for (Object eachAgreementAssetEvent : agreementAssetEventList) {
      JSONObject agreementAssetEvent = (JSONObject) eachAgreementAssetEvent;
      System.out.println("Agreement Asset Event: " + agreementAssetEvent);
      System.out.println();
    }
  }
}