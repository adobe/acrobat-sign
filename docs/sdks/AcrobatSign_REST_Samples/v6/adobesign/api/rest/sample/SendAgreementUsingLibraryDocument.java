/*************************************************************************
 * ADOBE SYSTEMS INCORPORATED
 * Copyright 2018 Adobe Systems Incorporated
 * All Rights Reserved.
 * 
 * NOTICE: Adobe permits you to use, modify, and distribute this file in accordance with the
 * terms of the Adobe license agreement accompanying it. If you have received this file from a
 * source other than Adobe, then your use, modification, or distribution of it requires the prior
 * written permission of Adobe.
 **************************************************************************/

package adobesign.api.rest.sample;

import adobesign.api.rest.sample.util.RestApiAgreements;
import adobesign.api.rest.sample.util.RestApiLibraryDocuments;
import adobesign.api.rest.sample.util.RestApiOAuthTokens;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * This sample client demonstrates how to send an agreement using a library document ID. The user needs to have have at
 * least one library template of document type in their account to run this sample successfully.
 * 
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the JSON files 'OAuthCredentials.json' and 'SendAgreement.json'
 * with appropriate values. Which values need to be specified is indicated in the files.
 * You can also provide OAuth access token in OAUTH_ACCESS_TOKEN variable in RestApiOAuthTokens class which will then be used as OAuth access token for making api calls.
 * You can also provide refresh token in OAUTH_REFRESH_TOKEN variable in RestApiOAuthTokens class to refresh OAuth access token.
 *
 * Note: The access token must have agreement_write scope to run this sample.
 * </p>
 */
public class SendAgreementUsingLibraryDocument {
  // File containing the request JSON for fetching access token.
  private static final String authRequestJSONFileName = "OAuthCredentials.json";

  // File containing the request JSON for sending an agreement.
  private static final String sendAgreementJSONFileName = "SendAgreement.json";

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      SendAgreementUsingLibraryDocument client = new SendAgreementUsingLibraryDocument();
      client.run();
    }
    catch (Exception e) {
      System.err.println("Failure in sending the agreemnet using the library document ID specified.");
      e.printStackTrace();
    }
  }

  /**
   * Execution of this sample client program.
   */
  private void run() throws Exception {
    // Fetch oauth access token to make further API calls.
    String accessToken = RestApiOAuthTokens.getOauthAccessToken(authRequestJSONFileName);

    // Fetch library documents of the user using access token from above.
    JSONObject libraryDocumentsResponse = RestApiLibraryDocuments.getLibraryDocuments(accessToken);

    // Retrieve library documents list for the user and fetch the ID of first library document.
    JSONArray libraryDocumentList = (JSONArray) libraryDocumentsResponse.get("libraryDocumentList");
    
    String libraryDocumentId = null;
    
    // Fetch the first personal or shared library document of the user.
    for (Object eachLibraryDocument : libraryDocumentList) {
      JSONObject libraryDocument = (JSONObject) eachLibraryDocument;
      if (libraryDocument.get("sharingMode").equals("ACCOUNT") || libraryDocument.get("sharingMode").equals("GROUP") || libraryDocument.get("sharingMode").equals("USER")) {
        libraryDocumentId = (String) libraryDocument.get("id");
        break;
      }
    }
    
    if (libraryDocumentId != null && !libraryDocumentId.isEmpty()) {
      // Send agreement using this library document ID retrieved from above.
      JSONObject sendAgreementResponse = RestApiAgreements.sendAgreement(accessToken, sendAgreementJSONFileName, libraryDocumentId,
                                                                         RestApiAgreements.DocumentIdentifierName.LIBRARY_DOCUMENT_ID);

      // Parse and read response.
      System.out.println("Agreement Sent. Agreement ID = " + sendAgreementResponse.get("id"));
    }
    else {
      System.err.println("No library documents found.");
    }
  }
}