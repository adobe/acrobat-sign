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

import org.json.simple.JSONObject;

import adobesign.api.rest.sample.util.RestApiAgreements;
import adobesign.api.rest.sample.util.RestApiOAuthTokens;
import adobesign.api.rest.sample.util.RestApiUtils;
import adobesign.api.rest.sample.util.RestApiWidgets;
import adobesign.api.rest.sample.util.RestApiAgreements.DocumentIdentifierName;

/**
 * This sample client demonstrates how to create a new widget.
 * 
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the JSON files 'OAuthCredentials.json' and 'CreateWidget.json' with
 * appropriate values. Which values need to be specified is indicated in the files.
 * You can also provide OAuth access token in OAUTH_ACCESS_TOKEN variable in RestApiOAuthTokens class which will then be used as OAuth access token for making api calls.
 * You can also provide refresh token in OAUTH_REFRESH_TOKEN variable in RestApiOAuthTokens class to refresh OAuth access token.
 *
 * Note: The access token must have widget_write scope to run this sample.
 * </p>
 */
public class CreateNewWidgetWithCounterSigners {

  // File containing request body to get an access token.
  private static final String authRequestJSONFileName = "OAuthCredentials.json";
  
  // File containing request body for creating a widget.
  private final static String createWidgetJSONFileName = "CreateWidget.json";
  
  //Name of the file to be uploaded for sending an agreement.
  // TODO: Specify file name of choice here. The file must exist in the "requests" sub-package.
  private static final String fileToBeUploaded = "Sample.pdf";
  
  //Name of the file from which form fields are to be extracted.
  // TODO: Specify file name of choice here. The file must exist in the "requests" sub-package.
  private static final String fileforFormFields = "DocumentWithFormFields.pdf";
  
  // Mime-type of the file being uploaded.
  // TODO: Change this depending on actual file used.
  private static final String mimeType = RestApiUtils.MimeType.PDF.toString();
  
  // Name to be given to the file after uploading it.
  // TODO: Specify a file name of choice, ensuring that its name consists only of characters in the ASCII character set (given this basic
  // sample implementation).
  private static final String uploadedFileName = "UploadedSample.pdf";
  
  // Name to be given to the file containing form fields.
  // TODO: Specify a file name of choice, ensuring that its name consists only of characters in the ASCII character set (given this basic
  // sample implementation).
  private static final String formFieldsFileName = "formFieldsSample.pdf";


  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      CreateNewWidgetWithCounterSigners client = new CreateNewWidgetWithCounterSigners();
      client.run();
    }
    catch (Exception e) {
      System.err.println("Failure in creating a new widget for the user.");
      e.printStackTrace();
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception {
    // Get oauth access token to make further API calls.
    String accessToken = RestApiOAuthTokens.getOauthAccessToken(authRequestJSONFileName);

    // Upload a transient document with form fields to be used for extracting form fields for the created widget.
    JSONObject uploadFormFieldDocumentResponse = RestApiAgreements.postTransientDocument(accessToken, mimeType, fileforFormFields, formFieldsFileName);
    String formFieldDocumentId = (String) uploadFormFieldDocumentResponse.get("transientDocumentId");

    // Associate the identifiers with the uploaded documents.
    DocumentIdentifierName formFieldIdName = DocumentIdentifierName.TRANSIENT_DOCUMENT_ID;    
    
    // Make API call to create new widget
    JSONObject widget = RestApiWidgets.createWidget(accessToken, createWidgetJSONFileName, formFieldDocumentId, formFieldIdName);

    // Display widget ID and corresponding code of newly created widget.
    System.out.println("Newly created widget's ID: " + widget.get("id"));
  }
}