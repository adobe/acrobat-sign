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

import adobesign.api.rest.sample.util.FileUtils;
import adobesign.api.rest.sample.util.RestApiAgreements;
import adobesign.api.rest.sample.util.RestApiAgreements.DocumentIdentifierName;
import adobesign.api.rest.sample.util.RestApiOAuthTokens;
import adobesign.api.rest.sample.util.RestApiUtils;

/**
 * This sample client demonstrates how to replace a signer.
 * Both the old signer as well as the new signer will be able to sign the agreement.
 * <p>
 * Work flow implemented:
 * <ol>
 * <li>The sender sends an agreement for a participant to sign.</li>
 * <li>The sender then replaces the signer with the first participant from the participating set.</li>
 * </ol>
 * </p>
 * <p>
 * <b>IMPORTANT</b>
 * <ol>
 * <li>Before running this sample, check that you have modified the JSON files 'OAuthCredentials.json','ReplaceSigner.json' and 'SendAgreement.json'
 * with appropriate values. Which values need to be specified is indicated in the file.</li>
 * <li>You can also provide OAuth access token in OAUTH_ACCESS_TOKEN variable in RestApiOAuthTokens class which will then be used as OAuth access
 * token for making API calls.</li>
 * <li>You can also provide refresh token in OAUTH_REFRESH_TOKEN variable in RestApiOAuthTokens class to refresh OAuth access token.</li>
 * </ol>
 * </p>
 */
public class ReplaceSigner {
  // File containing the request JSON for fetching access token.
  private static final String authRequestJSONFileName = "OAuthCredentials.json";

  // File containing the request JSON for replacing signer.
  private static final String replaceSignerJSONFileName = "ReplaceSigner.json";

  // File containing the request JSON for sending an agreement.
  private static final String sendAgreementJSONFileName = "SendAgreement.json";

  // Name of the file to be uploaded for sending an agreement.
  // TODO: Specify file name of choice here. The file must exist in the "requests" sub-package.
  private static final String fileToBeUploaded = "Sample.pdf";

  // Mime-type of the file being uploaded. TODO: Change this depending on actual file used.
  private static final String mimeType = RestApiUtils.MimeType.PDF.toString();

  // Name to be given to the file after uploading it.
  // TODO: Specify a file name of choice, ensuring that its name consists only of characters in the ASCII character set (given this basic sample implementation).
  private static final String uploadedFileName = "UploadedSample.pdf";

  private static final String TRANSIENT_DOCUMENT_ID = "transientDocumentId";
  private static final String AGREEMENT_ID = "agreementId";
  private static final String PARTICIPANT_ID = "participantId";

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      ReplaceSigner client = new ReplaceSigner();
      client.run();
    }
    catch (Exception e) {
      System.err.println("Failure in Replacing Signer.");
      e.printStackTrace();
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception {
    // Get OAuth access token to make further API calls.
    String accessToken = RestApiOAuthTokens.getOauthAccessToken(authRequestJSONFileName);

    // Send a sample agreeement which can be used in the replacing Signer function call.
    // Upload a transient document and retrieve transient document ID from the response.
    JSONObject uploadDocumentResponse = RestApiAgreements.postTransientDocument(accessToken, mimeType, fileToBeUploaded, uploadedFileName);
    String transientDocumentId = (String) uploadDocumentResponse.get(TRANSIENT_DOCUMENT_ID);

    // Send an agreement using the transient document ID derived from above.
    DocumentIdentifierName idName = DocumentIdentifierName.TRANSIENT_DOCUMENT_ID;
    JSONObject sendAgreementResponse = RestApiAgreements.sendAgreement(accessToken, sendAgreementJSONFileName, transientDocumentId, idName);
    String agreementId = sendAgreementResponse.get(AGREEMENT_ID).toString();

    // Following code makes call to doReplaceSigner function to do the signer replacement and get replaced signer ID.
    JSONObject requestJson = FileUtils.getRequestJson(replaceSignerJSONFileName);
    JSONObject replacedSigner = RestApiAgreements.doReplaceSigner(accessToken, agreementId, requestJson);

    if (replacedSigner != null) {
      // Display replaced signer ID.
      System.out.println("Replaced Signer ID: " + replacedSigner.get(PARTICIPANT_ID));
      System.out.println();
    }
    else {
      System.err.println("Signer Not Replaced.");
    }
  }
}
