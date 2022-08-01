/*************************************************************************
 * ADOBE SYSTEMS INCORPORATED
 * Copyright 2016 Adobe Systems Incorporated
 * All Rights Reserved.
 * NOTICE: Adobe permits you to use, modify, and distribute this file in accordance with the
 * terms of the Adobe license agreement accompanying it. If you have received this file from a
 * source other than Adobe, then your use, modification, or distribution of it requires the prior
 * written permission of Adobe.
 **************************************************************************/

package adobesign.api.rest.sample;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import adobesign.api.rest.sample.util.RestApiLibraryDocuments;
import adobesign.api.rest.sample.util.RestApiMegaSigns;
import adobesign.api.rest.sample.util.RestApiOAuthTokens;

/**
 * This sample client demonstrates how to send a megaSign using a library document ID.
 * <p>
 * <b>IMPORTANT</b>
 * <ol>
 * <li>Before running this sample, check that you have modified the JSON files 'OAuthCredentials.json' and 'SendMegaSign.json' with appropriate
 * values. Which values need to be specified is indicated in the files.</li>
 * <li>You can also provide OAuth access token in OAUTH_ACCESS_TOKEN variable in RestApiOAuthTokens class which will then be used as OAuth access
 * token for making api calls.</li>
 * <li>You can also provide refresh token in OAUTH_REFRESH_TOKEN variable in RestApiOAuthTokens class to refresh OAuth access token.</li>
 * </ol>
 * </p>
 */
public class SendMegaSignUsingLibraryDocument {
  // File containing the request JSON for fetching access token.
  private static final String authRequestJSONFileName = "OAuthCredentials.json";

  // File containing the request JSON for sending a megasign parent agreement.
  private static final String sendMegaSignJSONFileName = "SendMegaSign.json";

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      SendMegaSignUsingLibraryDocument client = new SendMegaSignUsingLibraryDocument();
      client.run();
    }
    catch (Exception e) {
      System.err.println("Failure in sending the megasign parent agreement using the library document ID specified.");
      e.printStackTrace();
    }
  }

  /**
   * Entry point for this sample client program.
   */
  private void run() throws Exception {
    // Fetch OAuth access token to make further API calls.
    String accessToken = RestApiOAuthTokens.getOauthAccessToken(authRequestJSONFileName);

    // Fetch library documents of the user using access token from above.
    JSONObject libraryDocumentsResponse = RestApiLibraryDocuments.getLibraryDocuments(accessToken);

    // Retrieve library documents list for the user and fetch the document ID of first library document.
    JSONArray libraryDocumentList = (JSONArray) libraryDocumentsResponse.get("libraryDocumentList");

    String libraryDocumentId = null;

    // Fetch the first personal or shared library document of the user.
    for (Object eachLibraryDocument : libraryDocumentList) {
      JSONObject libraryDocument = (JSONObject) eachLibraryDocument;
      if (libraryDocument.get("scope").equals("SHARED") || libraryDocument.get("scope").equals("PERSONAL")) {
        libraryDocumentId = (String) libraryDocument.get("libraryDocumentId");
        break;
      }
    }

    if (libraryDocumentId != null && !libraryDocumentId.isEmpty()) {
      // Send a megasign parent agreement using this library document ID retrieved from above.
      JSONObject sendMegaSignResponse = RestApiMegaSigns.sendMegaSign(accessToken, sendMegaSignJSONFileName, libraryDocumentId, RestApiMegaSigns.DocumentIdentifierName.LIBRARY_DOCUMENT_ID);

      // Parse and read response.
      if (sendMegaSignResponse != null)
        System.out.println("MegaSign Sent. MegaSign ID = " + sendMegaSignResponse.get("megaSignId"));
    }
    else {
      System.err.println("No Library documents found.");
    }
  }
}
