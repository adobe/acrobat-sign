/*************************************************************************
 * ADOBE SYSTEMS INCORPORATED
 * Copyright 2016 Adobe Systems Incorporated
 * All Rights Reserved.
 * NOTICE: Adobe permits you to use, modify, and distribute this file in accordance with the
 * terms of the Adobe license agreement accompanying it. If you have received this file from a
 * source other than Adobe, then your use, modification, or distribution of it requires the prior
 * written permission of Adobe.
 **************************************************************************/

package adobesign.api.rest.sample.util;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONObject;

/**
 * Encapsulates calls to REST end points related to megasign parent agreement.
 */
public class RestApiMegaSigns {
  // End point components used by this class.
  private final static String AGREEMENTS_ENDPOINT = "/agreements";
  private final static String MEGASIGNS_ENDPOINT = "/megaSigns";
  private static final String TRANSIENT_DOCUMENTS_ENDPOINT = "/transientDocuments";

  private static final String FILEINFOS = "fileInfos";

  /**
   * Represents the various ways that a set of documents can be identified, depending on the context.
   */
  public static enum DocumentIdentifierName {
    TRANSIENT_DOCUMENT_ID("transientDocumentId"),
    LIBRARY_DOCUMENT_ID("libraryDocumentId"),
    DOCUMENT_URL("documentURL"),
    LIBRARY_DOCUMENT_NAME("libraryDocumentName");

    private final String actualName;

    DocumentIdentifierName(String actualName) {
      this.actualName = actualName;
    }

    @Override
    public String toString() {
      return actualName;
    }
  }

  /**
   * Creates a megasign parent agreement using the specified document, and sends it to the recipients specified in the input JSON file. Most of the
   * information about sending megasign parent agreement should be specified in the file itself. The document ID is added to the structure dynamically based on
   * the ID name specified by the caller, which also determines the format in which to specify the document ID.
   *
   * @param accessToken     Access token of the API user.
   * @param requestJsonFile Name of the file containing the JSON structure used as the input for this API call.
   * @param documentId      Document ID of the document to be associated with the MegaSign parent agreement. It can refer to a transient document or a library
   *                        document.
   * @param docIdName       Name by which to refer to a list containing document IDs when adding it to the input JSON structure. Must be one of
   *                        <ul>
   *                        <li>DocumentIdentifierName.TRANSIENT_DOCUMENT_IDS</li>
   *                        <li>DocumentIdentifierName.LIBRARY_DOCUMENT_ID</li>
   *                        </ul>
   * @return JSON response containing the ID of the newly created MegaSign parent agreement.
   * @throws Exception
   * @see DocumentIdentifierName
   */
  @SuppressWarnings("unchecked")
  public static JSONObject sendMegaSign(String accessToken, String requestJsonFile, String documentId, DocumentIdentifierName docIdName) throws Exception {
    // URL to invoke the megaSigns end point.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + MEGASIGNS_ENDPOINT;

    // Create HTTP header list
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.CONTENT_TYPE.toString(), RestApiUtils.MimeType.JSON.toString());
    headers.put(RestApiUtils.HttpHeaderField.ACCESS_TOKEN.toString(), accessToken);

    // Invoke API and get JSON response. The ID name determines what the input (request) JSON structure should contain.
    JSONObject responseJson = null;
    JSONObject requestJson = FileUtils.getRequestJson(requestJsonFile);
    if (requestJson != null) {
      JSONObject megaSignCreationInfo = (JSONObject) requestJson.get("megaSignCreationInfo");

      // Check from the input parameter "docIdName" whether the file type to be used in sending a megasign parent agreement is a library document or a transient document.
      // Based on the document type retrieved from above, set the corresponding item in the request JSON structure.
      // Currently the function handles only two cases where the Document Type is either Transient Document or Library Document
      if (docIdName == DocumentIdentifierName.LIBRARY_DOCUMENT_ID || docIdName == DocumentIdentifierName.TRANSIENT_DOCUMENT_ID) {

        ArrayList<JSONObject> fileInfos = new ArrayList<JSONObject>();
        JSONObject fileInfo = new JSONObject();
        fileInfo.put(docIdName, documentId);
        fileInfos.add(fileInfo);
        megaSignCreationInfo.put(FILEINFOS, fileInfos);
        responseJson = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.POST, headers, requestJson.toString());
      } else
        System.err.println("Invalid document identifier name. Currently the function handles only two cases where the document type is either transient document or library document");
    }

    return responseJson;
  }

  /**
   * Returns a list of all megasign parent agreements (and their meta data) owned by the API user.
   *
   * @param accessToken Access token of the API user.
   * @return JSON response containing the list of megasign parent agreements.
   * @throws Exception
   */
  public static JSONObject getMyMegaSigns(String accessToken) throws Exception {
    // URL to invoke the megaSigns end point.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + MEGASIGNS_ENDPOINT;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.ACCESS_TOKEN.toString(), accessToken);

    // Invoke API and get JSON response.
    JSONObject responseJson = null;
    responseJson = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.GET, headers);

    return responseJson;
  }

  /**
   * Returns information about the specified megaSign.
   *
   * @param accessToken Access token of the API user.
   * @param megaSignId  ID of megasign parent agreement.
   * @return JSON response containing information about the MegaSign parent agreement.
   * @throws Exception
   */
  public static JSONObject getMegaSignInfo(String accessToken, String megaSignId) throws Exception {
    // URL to invoke the megaSign end point.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + MEGASIGNS_ENDPOINT + "/" + megaSignId;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.ACCESS_TOKEN.toString(), accessToken);

    // Invoke API and get JSON response.
    JSONObject responseJson = null;
    responseJson = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.GET, headers);

    return responseJson;
  }

  /**
   * Returns a list of all agreement IDs (and their meta data) associated with a megasign parent agreement.
   *
   * @param accessToken Access token of the API user.
   * @param megaSignId  ID of MegaSign Parent Agreement.
   * @return JSON response containing the list of agreements.
   * @throws Exception
   */
  public static JSONObject getMegaSignAgreements(String accessToken, String megaSignId) throws Exception {
    // URL to invoke the agreement end-point for a megasign parent agreement.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + MEGASIGNS_ENDPOINT + "/" + megaSignId + AGREEMENTS_ENDPOINT;

    // Create header list
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.ACCESS_TOKEN.toString(), accessToken);

    // Invoke API and get JSON response
    JSONObject responseJson = null;
    responseJson = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.GET, headers);

    return responseJson;
  }
}
