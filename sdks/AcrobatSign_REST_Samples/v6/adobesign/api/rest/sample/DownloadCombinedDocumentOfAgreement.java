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

import adobesign.api.rest.sample.util.FileUtils;
import adobesign.api.rest.sample.util.RestApiAgreements;
import adobesign.api.rest.sample.util.RestApiOAuthTokens;
import adobesign.api.rest.sample.util.RestError;
import org.json.simple.JSONObject;

/**
 * This sample client demonstrates how to download combined document of the specified agreement.
 *
 * <p>
 * <b>IMPORTANT</b>:
 * <ol>
 * <li>Before running this sample, check that you have modified the JSON file 'OAuthCredentials.json' with appropriate values. Which values need to be
 * specified is indicated in the file.</li>
 * <li>You can also provide OAuth access token in OAUTH_ACCESS_TOKEN variable in RestApiOAuthTokens class which will then be used as OAuth access token for making api calls.</li>
 * <li>You can also provide refresh token in OAUTH_REFRESH_TOKEN variable in RestApiOAuthTokens class to refresh OAuth access token. </li>
 * <li>Make sure that you have specified a valid agreement ID in <code>agreementId</code> below.</li>
 * <li>Check that the default output location in the field <code>OUTPUT_PATH</code> of FileUtils.java is suitable.</li>
 * </ol>
 *
 * Note: The access token must have agreement_read scope to run this sample.
 * </p>
 */
public class DownloadCombinedDocumentOfAgreement {
  // TODO: Enter a valid agreement ID. Please refer to the "agreements" end-point in the API documentation to learn how to obtain IDs of
  // agreements present in Adobe Sign.
  private static String agreementId = "a valid agreement ID";

  // File containing request body to get an access token.
  private static final String authRequestJSONFileName = "OAuthCredentials.json";

  // Combined document file name
  private static final String combinedDoc = "combinedDoc";

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      DownloadCombinedDocumentOfAgreement client = new DownloadCombinedDocumentOfAgreement();
      client.run();
    }
    catch (Exception e) {
      System.err.println("Error while retrieving combined document of agreement");
      e.printStackTrace();
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception {
    // Get oauth access token to make further API calls.
    String accessToken = RestApiOAuthTokens.getOauthAccessToken(authRequestJSONFileName);

    // Display name of the agreement associated with the specified agreement ID.
    JSONObject agreementInfo = RestApiAgreements.getAgreementInfo(accessToken, agreementId);
    String agreementName = (String) agreementInfo.get("name");
    System.out.println("Agreement name: " + agreementName);

    String fileName = agreementName + "_" + combinedDoc + "_" + System.currentTimeMillis() + ".pdf";
    System.out.println("Saving combined document of agreement '" + fileName + "'");

    // Make API call to retrieve combined document of this agreement.
    byte combinedDocumentStream[] = RestApiAgreements.getAgreementCombinedBytes(accessToken, agreementId);

    if (combinedDocumentStream != null) {
      boolean success = FileUtils.saveToFile(combinedDocumentStream, FileUtils.AGREEMENT_COMBINED_DOC_OUTPUT_PATH, fileName);
      if (success)
        System.out.println("Successfully saved combined document of agreement in '" + FileUtils.AGREEMENT_COMBINED_DOC_OUTPUT_PATH + "'.");
      else
        System.err.println(RestError.FILE_NOT_SAVED.errMessage);
    }
    else {
      System.err.println("Error while retrieving combined document of agreement: " + agreementName);
    }
  }
}
