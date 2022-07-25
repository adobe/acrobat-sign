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
 * This sample client demonstrates how to begin searching for agreement asset events for the user whose access token is taken as input.
 * It calls the POST /search/agreementAssetEvents endpoint, which returns a search ID and a page cursor for the next page.
 * To retrieve the next page of search results, use the sample client GetSearchAgreementAssetEventsForUser.java.
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the JSON files 'OAuthCredentials.json' and
 * 'BeginAgreementAssetEventSearchForUser.json' with appropriate values. The values need to be specified is indicated in the files.
 * </p>
 */
public class CreateSearchForAgreementAssetEventForUser {

  // File containing request body to get an access token.
  private static final String authRequestJSONFileName = "OAuthCredentials.json";

  // File containing request body for creating a search object.
  private final static String searchRequestJSONFileName = "BeginAgreementAssetEventsSearchForUser.json";

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      CreateSearchForAgreementAssetEventForUser client = new CreateSearchForAgreementAssetEventForUser();
      client.run();
    }
    catch (Exception e) {
      System.err.println("Failure in creating new search for agreement asset events for user.");
      e.printStackTrace();
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception {
    // Get access token to make further API calls.
    String accessToken = RestApiOAuthTokens.getOauthAccessToken(authRequestJSONFileName);

    // Get request JSON to create a search object of Agreement Events from the specified file.
    JSONObject requestBody = FileUtils.getRequestJson(searchRequestJSONFileName);

    // Make API call to POST /search/agreemennAssetEvents. This API call will take the input request from
    // BeginAgreementAssetEventsSearchForUser.json. The output will be result for the first page on the basis of page size
    // given. It will also return a search ID and page cursor for the next page which can be used inside
    // ResumeAgreementAssetEventsSearchForUser.json to call GET /search/agreementAssetEventsForUsers/{searchId} to fetch more records.
    JSONObject newSearch = RestApiSearch.createSearchAgreementEventsForUser(accessToken, requestBody);

    JSONArray agreementEvents = (JSONArray) newSearch.get(RestApiSearch.EVENTS);

    if (agreementEvents == null)
    {
      // In case there are no agreement asset events in the given range
      System.out.println("No agreement asset events found in the given range");
    }

    else
    {
      // Display the first agreement asset event.
      System.out.println("First Agreement Event " + (agreementEvents.get(0).toString()));
    }
  }
}
