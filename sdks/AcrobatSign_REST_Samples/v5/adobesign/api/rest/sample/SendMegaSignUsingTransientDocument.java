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

import org.json.simple.JSONObject;

import adobesign.api.rest.sample.util.RestApiAgreements;
import adobesign.api.rest.sample.util.RestApiMegaSigns;
import adobesign.api.rest.sample.util.RestApiMegaSigns.DocumentIdentifierName;
import adobesign.api.rest.sample.util.RestApiOAuthTokens;
import adobesign.api.rest.sample.util.RestApiUtils;

/**
 * This sample client demonstrates how to send an megaSign using a transient document ID. See {@link RestApiAgreements#postTransientDocument} for a definition of transient documents.
 * <p/>
 * <p>
 * <b>IMPORTANT</b>:
 * <ol>
 * <li>Before running this sample, check that you have modified the JSON files 'OAuthCredentials.json' and 'SendMegaSign.json' with appropriate values.
 * Which values need to be specified is indicated in the files.</li>
 * <li>You can also provide OAuth access token in OAUTH_ACCESS_TOKEN variable in RestApiOAuthTokens class which will then be used as OAuth access token for making api calls.</li>
 * <li>You can also provide refresh token in OAUTH_REFRESH_TOKEN variable in RestApiOAuthTokens class to refresh OAuth access token. </li>
 * <li>Check that the default input file in the field <code>fileToBeUploaded</code> below is suitable.</li>
 * <li>Check that the name to be given to the uploaded file in the field <code>uploadedFileName</code> below is suitable. This name can be
 * different from the original file name.</li>
 * </ol>
 * </p>
 */
public class SendMegaSignUsingTransientDocument {

  // File containing the request JSON for fetching access token.
  private static final String authRequestJSONFileName = "OAuthCredentials.json";

  // File containing the request JSON for sending a megasign parent agreement.
  private static final String sendMegaSignJSONFileName = "SendMegaSign.json";

  // Name of the file to be uploaded for sending a megasign.
  // TODO: Specify file name of choice here. The file must exist in the "requests" sub-package.
  private static final String fileToBeUploaded = "Sample.pdf";

  // Mime-type of the file being uploaded.
  // TODO: Change this depending on actual file used.
  private static final String mimeType = RestApiUtils.MimeType.PDF.toString();

  // Name to be given to the file after uploading it.
  // TODO: Specify a file name of choice, ensuring that its name consists only of characters in the ASCII character set (given this basic sample implementation).
  private static final String uploadedFileName = "UploadedSample.pdf";

  private static final String TRANSIENT_DOCUMENT_ID = "transientDocumentId";
  private static final String MEGASIGN_ID = "megaSignId";

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      SendMegaSignUsingTransientDocument client = new SendMegaSignUsingTransientDocument();
      client.run();
    }
    catch (Exception e) {
      System.err.println("Failure in sending the MegaSign parent agreement using the transient document ID.");
      e.printStackTrace();
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception {
    // Fetch OAuth access token to make further API calls.
    String accessToken = RestApiOAuthTokens.getOauthAccessToken(authRequestJSONFileName);

    // Upload a transient document and retrieve transient document ID from the response.
    JSONObject uploadDocumentResponse = RestApiAgreements.postTransientDocument(accessToken, mimeType, fileToBeUploaded, uploadedFileName);
    String transientDocumentId = (String) uploadDocumentResponse.get(TRANSIENT_DOCUMENT_ID);

    // Send a megasign parent agreement using the transient document ID derived from above.
    DocumentIdentifierName idName = DocumentIdentifierName.TRANSIENT_DOCUMENT_ID;
    JSONObject sendMegaSignUsingTransientDocumentResponse = RestApiMegaSigns.sendMegaSign(accessToken, sendMegaSignJSONFileName, transientDocumentId, idName);

    // Parse and read response.
    if (sendMegaSignUsingTransientDocumentResponse != null)
      System.out.println("MegaSign Sent. MegaSign ID = " + sendMegaSignUsingTransientDocumentResponse.get(MEGASIGN_ID));
  }
}
