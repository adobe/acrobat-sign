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

import adobesign.api.rest.sample.util.RestApiLibraryDocuments;
import adobesign.api.rest.sample.util.RestApiOAuthTokens;

/**
 * This sample client demonstrates how to retrieve library documents of a user in the API caller's account.
 * 
 * <p>
 * <b>IMPORTANT</b>:
 * <ol>
 * <li>Before running this sample, check that you have modified the JSON file 'OAuthCredentials.json' with appropriate values. Which values need to be
 * specified is indicated in the file.</li>
 * <li>You can also provide OAuth access token in OAUTH_ACCESS_TOKEN variable in RestApiOAuthTokens class which will then be used as OAuth access token for making api calls.</li>
 * <li>You can also provide refresh token in OAUTH_REFRESH_TOKEN variable in RestApiOAuthTokens class to refresh OAuth access token. </li>
 * <li>Check that you have specified the email ID (in the <code>userEmail</code> field below) of a user in the API caller's account.</li>
 * </p>
 */
public class GetPersonalLibraryDocumentsOfUser {

  // File containing the request JSON for fetching access token.
  private static final String authRequestJSONFileName = "OAuthCredentials.json";

  // Email ID of the user whose library documents are to be fetched
  // TODO: Enter a valid email ID.
  private static final String userEmail = "a valid email ID of a user in API caller's account";

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      GetPersonalLibraryDocumentsOfUser client = new GetPersonalLibraryDocumentsOfUser();
      client.run();
    }
    catch (Exception e) {
      System.err.println("Failure in fetching library documents of the user.");
      e.printStackTrace();
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception {
    // Fetch oauth access token to make further API calls.
    String accessToken = RestApiOAuthTokens.getOauthAccessToken(authRequestJSONFileName);

    // Fetch library documents of the specified user.
    JSONObject libraryDocumentsResponse = RestApiLibraryDocuments.getLibraryDocuments(accessToken, userEmail);

    // Parse and read response.
    JSONArray libraryDocumentList = (JSONArray) libraryDocumentsResponse.get("libraryDocumentList");
    for (Object eachLibraryDocument : libraryDocumentList) {
      JSONObject libraryDocument = (JSONObject) eachLibraryDocument;
      if (libraryDocument.get("scope").equals("PERSONAL")) {
        System.out.println("Name = " + libraryDocument.get("name"));
        System.out.println("Document ID = " + libraryDocument.get("libraryDocumentId"));
        System.out.println();
      }
    }
  }
}
