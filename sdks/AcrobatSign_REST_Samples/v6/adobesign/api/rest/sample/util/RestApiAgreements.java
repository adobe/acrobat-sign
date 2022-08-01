/*************************************************************************
 * ADOBE SYSTEMS INCORPORATED
 * Copyright 2018 Adobe Systems Incorporated
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
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Encapsulates calls to REST end points related to agreements, documents and related resources.
 */
public class RestApiAgreements {
  // End point components used by this class.
  private final static String AGREEMENTS_ENDPOINT = "/agreements";
  private final static String AUDIT_ENDPOINT = "/auditTrail";
  private final static String DOCUMENTS_ENDPOINT = "/documents";
  private final static String COMBINEDDOC_ENDPOINT = "/combinedDocument";
  private final static String MEMBERS_ENDPOINT = "/members";
  private static final String REMINDERS_ENDPOINT = "/reminders";
  private static final String SIGNING_URLS_ENDPOINT = "/signingUrls";
  private static final String TRANSIENT_DOCUMENTS_ENDPOINT = "/transientDocuments";

  private static final String FILEINFOS = "fileInfos";

  /**
   * Represents the various ways that a set of documents can be identified, depending on the context.
   */
  public static enum DocumentIdentifierName {
    TRANSIENT_DOCUMENT_ID("transientDocumentId"),
    LIBRARY_DOCUMENT_ID("libraryDocumentId"),
    DOCUMENT_URL("documentURL");

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
   * Uploads a transient document to the Adobe Sign server, typically as part of an agreement sending workflow. A "transient document" is a
   * temporary copy of the uploaded document which is available for a limited time after which it is deleted automatically.
   *
   * @param accessToken      Access token of the API user.
   * @param mimeType         The mime type of the file to be uploaded.
   * @param fileToBeUploaded Name of the file to be uploaded. The file must exist in the "requests" sub-package.
   * @param uploadedFileName Name to be given to the uploaded file. The name can be different from the original name, but must consist only
   *                         of characters in the ASCII character given this basic sample implementation.
   * @return JSON response containing the ID of the uploaded transient document.
   * @throws Exception
   */
  public static JSONObject postTransientDocument(String accessToken, String mimeType, String fileToBeUploaded, String uploadedFileName) throws Exception {
    // URL to invoke the transient documents end point.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + TRANSIENT_DOCUMENTS_ENDPOINT;

    // Create header list for the request.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.AUTHORIZATION.toString(), accessToken);
    headers.put(RestApiUtils.HttpHeaderField.ACCEPT.toString(), "application/json");

    // Meta-data associated with the file.
    HashMap<String, String> fileMetaData = new HashMap<String, String>();
    fileMetaData.put(RestApiUtils.HttpHeaderField.MIME_TYPE.toString(), mimeType);
    fileMetaData.put(RestApiUtils.HttpHeaderField.FILE_NAME.toString(), uploadedFileName);

    // Get a reference to the file to be uploaded to Adobe Sign.
    String pathToFile = FileUtils.REQUEST_PATH + fileToBeUploaded;
    URL fileUrl = ClassLoader.getSystemResource(pathToFile);
    File fileToUpload = new File(fileUrl.getPath());

    // Invoke API and get JSON response
    JSONObject responseJson = (JSONObject) RestApiUtils.makeApiCall(url, headers, fileMetaData, fileToUpload);
    return responseJson;
  }

  /**
   * Creates an agreement using the specified document, and sends it to the recipients specified in the input JSON file. Most of the
   * agreement-sending information should be specified in the file itself. The document ID is added to the structure dynamically based on
   * the ID name specified by the caller, which also determines the format in which to specify the document ID.
   *
   * @param accessToken     Access token of the API user.
   * @param requestJsonFile Name of the file containing the JSON structure used as the input for this API call.
   * @param documentId      Document ID of the document to be associated with the agreement. It can refer to a transient document or a library
   *                        document.
   * @param idName          Name by which to refer to a list containing document IDs when adding it to the input JSON structure. Must be one of
   *                        <ul>
   *                        <li>DocumentIdentifierName.TRANSIENT_DOCUMENT_IDS</li>
   *                        <li>DocumentIdentifierName.LIBRARY_DOCUMENT_ID</li>
   *                        </ul>
   * @return JSON response containing the ID of the newly created agreement.
   * @throws Exception
   * @see DocumentIdentifierName
   */
  @SuppressWarnings("unchecked")
  public static JSONObject sendAgreement(String accessToken, String requestJsonFile, String documentId, DocumentIdentifierName idName) throws Exception {
    // URL to invoke the agreements end point.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + AGREEMENTS_ENDPOINT;

    // Create HTTP header list
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.CONTENT_TYPE.toString(), RestApiUtils.MimeType.JSON.toString());
    headers.put(RestApiUtils.HttpHeaderField.AUTHORIZATION.toString(), accessToken);

    // Invoke API and get JSON response. The ID name determines what the input (request) JSON structure should contain.
    JSONObject responseJson = null;
    JSONObject requestJson = FileUtils.getRequestJson(requestJsonFile);
    if (requestJson != null) {

      // Check from the input parameter "idName" whether the file type to be used in sending an agreement is a library document or a
      // transient document.
      // Based on the document type retrieved from above, set the corresponding item in the request JSON structure.
      if (idName == DocumentIdentifierName.LIBRARY_DOCUMENT_ID || idName == DocumentIdentifierName.TRANSIENT_DOCUMENT_ID) {

        ArrayList<JSONObject> fileInfos = new ArrayList<JSONObject>();
        JSONObject fileInfo = new JSONObject();
        fileInfo.put(idName, documentId);
        fileInfos.add(fileInfo);
        requestJson.put(FILEINFOS, fileInfos);
      }
      responseJson = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.POST, headers, requestJson.toString());
    }

    return responseJson;
  }

  /**
   * Sends an email to the participants of an agreement reminding them to sign it.
   *
   * @param accessToken     Access token of the API user.
   * @param requestJsonFile Name of the file containing the JSON structure used as the input for this API call.
   * @param agreementId     ID of the agreement whose participants will receive the reminder.
   * @return JSON response containing information about the reminder sent.
   * @throws Exception
   */
  @SuppressWarnings("unchecked")
  public static JSONObject sendReminder(String accessToken, String requestJsonFile, String agreementId, List<String> participantIds) throws Exception {
    // URL to invoke the reminder end-point
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + AGREEMENTS_ENDPOINT + "/" + agreementId + REMINDERS_ENDPOINT;

    // Create header list
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.CONTENT_TYPE.toString(), RestApiUtils.MimeType.JSON.toString());
    headers.put(RestApiUtils.HttpHeaderField.AUTHORIZATION.toString(), accessToken);

    // Invoke API and get JSON response
    JSONObject responseJson = null;
    JSONObject requestJson = FileUtils.getRequestJson(requestJsonFile);
    if (requestJson != null) {
      requestJson.replace("recipientParticipantIds", participantIds);
      responseJson = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.POST, headers, requestJson.toString());
    }
    return responseJson;
  }

  /**
   * Returns a list of agreements (and their meta data) owned by the API user.
   *
   * @param accessToken Access token of the API user.
   * @return JSON response containing the list of agreements.
   * @throws Exception
   */
  @SuppressWarnings("unchecked")
  public static JSONArray getMyAgreements(String accessToken) throws Exception {
    // URL to invoke the agreements end point.
    String endpointUrl = RestApiUtils.getBaseURIForAPI(accessToken) + AGREEMENTS_ENDPOINT;
    String url = endpointUrl;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.AUTHORIZATION.toString(), accessToken);

    // Invoke API and get JSON response.
    JSONArray agreementList = new JSONArray();
    String cursor = null;

    do{
      JSONObject myAgreements = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.GET, headers);

      if (myAgreements != null) {
        // Display agreement ID, name and status of each agreement.
        JSONArray currAgreementList = (JSONArray) myAgreements.get("userAgreementList");

        // add the current list to response agreement list
        agreementList.addAll(currAgreementList);

        // Fetch the next page cursor
        JSONObject page = (JSONObject) myAgreements.get("page");
        cursor = (String) page.get("nextCursor");

        // update cursor to fetch next page of agreements
        if(cursor != null && !cursor.trim().isEmpty())
          url = endpointUrl + "?cursor=" + cursor;
      }
      else {
        // no more agreements to fetch
        return agreementList;
      }
    } while(cursor != null);

    return agreementList;
  }

  /**
   * Returns information about the specified agreement.
   *
   * @param accessToken Access token of the API user(signer/sender).
   * @param agrId       The agreement ID.
   * @return JSON response containing signing url of the agreement.
   * @throws Exception
   */
  public static JSONObject getSigningUrl(String accessToken, String agrId) throws Exception {
    // URL to invoke the agreement end point.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + AGREEMENTS_ENDPOINT + "/" + agrId + SIGNING_URLS_ENDPOINT;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.AUTHORIZATION.toString(), accessToken);

    // Invoke API and get JSON response.
    JSONObject responseJson = null;
    responseJson = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.GET, headers);

    return responseJson;
  }

  /**
   * Returns information about the specified agreement.
   *
   * @param accessToken Access token of the API user.
   * @param agrId       The agreement ID.
   * @return JSON response containing information about the agreement.
   * @throws Exception
   */
  public static JSONObject getAgreementInfo(String accessToken, String agrId) throws Exception {
    // URL to invoke the agreement end point.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + AGREEMENTS_ENDPOINT + "/" + agrId;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.AUTHORIZATION.toString(), accessToken);

    // Invoke API and get JSON response.
    JSONObject responseJson = null;
    responseJson = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.GET, headers);

    return responseJson;
  }

  /**
   * Returns a list of all document IDs (and their meta data) associated with an agreement.
   * <p>
   * Note: Document IDs for the same document will be different as per their format (original vs. generated PDF). The IDs returned by
   * default represent documents in the converted PDF format. To get the supporting documents in their original format, append
   * "supportingDocumentContentFormat=ORIGINAL" to the query string of the end-point URL.
   * </p>
   *
   * @param accessToken Access token of the API user.
   * @param agrId       The agreement ID.
   * @return JSON response containing the list of documents.
   * @throws Exception
   */
  public static JSONObject getAgreementDocuments(String accessToken, String agrId) throws Exception {
    // URL to invoke the documents end-point for an agreement.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + AGREEMENTS_ENDPOINT + "/" + agrId + DOCUMENTS_ENDPOINT;

    // Create header list
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.AUTHORIZATION.toString(), accessToken);

    // Invoke API and get JSON response
    JSONObject responseJson = null;
    responseJson = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.GET, headers);

    return responseJson;
  }

  /**
   * Returns as a byte array the contents of a document associated with a specified agreement.<br>
   * Note: The format of content can either be PDF or original, depending upon the format associated with ID.
   *
   * @param accessToken Access token of the API user.
   * @param agrId       The agreement ID.
   * @param docId       The document ID.
   * @return Byte array containing contents of the specified document.
   * @throws Exception
   */
  public static byte[] getDocumentBytes(String accessToken, String agrId, String docId) throws Exception {
    // URL to invoke the document end-point for an agreement.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + AGREEMENTS_ENDPOINT + "/" + agrId + DOCUMENTS_ENDPOINT + "/" + docId;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.AUTHORIZATION.toString(), accessToken);

    // Invoke API and get bytes of file.
    byte[] responseBytes = null;
    responseBytes = (byte[]) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.GET, headers);

    return responseBytes;
  }

  /**
   * Returns as a byte array the audit trail (in PDF format) of a specified agreement.
   *
   * @param accessToken Access token of the API user.
   * @param agrId       The agreement ID.
   * @return Byte array containing contents of the audit trail.
   * @throws Exception
   */
  public static byte[] getAgreementAuditTrailBytes(String accessToken, String agrId) throws Exception {
    // URL to invoke the audit trail end-point for an agreement.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + AGREEMENTS_ENDPOINT + "/" + agrId + AUDIT_ENDPOINT;

    // Create header list
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.AUTHORIZATION.toString(), accessToken);

    // Invoke API and get the audit trail
    byte[] responseBytes = null;
    responseBytes = (byte[]) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.GET, headers);

    return responseBytes;
  }

  /**
   * <p>
   * Combines all documents associated with an agreement, except its audit trail, into a single PDF file and returns the contents of the
   * combined PDF file.
   * </p>
   * <p>
   * Note: To include the audit trail, include "auditReport=true" in the query string of the end-point URL.
   * </p>
   *
   * @param accessToken Access token of the API user.
   * @param agrId       The agreement ID.
   * @return Byte array containing contents of the combined PDF file.
   * @throws Exception
   */
  public static byte[] getAgreementCombinedBytes(String accessToken, String agrId) throws Exception {
    // URL to invoke the combined document end-point for an agreement.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + AGREEMENTS_ENDPOINT + "/" + agrId + COMBINEDDOC_ENDPOINT;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.AUTHORIZATION.toString(), accessToken);

    // Invoke API and get the combined PDF file as a byte array.
    byte[] responseBytes = null;
    responseBytes = (byte[]) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.GET, headers);

    return responseBytes;
  }

  /**
   * Returns information about the specified agreement.
   *
   * @param accessToken Access token of the API user.
   * @param agrId       The agreement ID.
   * @param includeNextParticipantSet  Should the response have the next participant set exclusively?
   * @return JSON response containing the members of the agreement.
   * @throws Exception
   */
  public static JSONObject getAgreementMembers(String accessToken, String agrId, boolean includeNextParticipantSet) throws Exception {
    // URL to invoke the agreement end point.
    String url = RestApiUtils.getBaseURIForAPI(accessToken) + AGREEMENTS_ENDPOINT + "/" + agrId + MEMBERS_ENDPOINT + "?includeNextParticipantSet=" + includeNextParticipantSet;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.AUTHORIZATION.toString(), accessToken);

    // Invoke API and get JSON response.
    JSONObject responseJson = null;
    responseJson = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.GET, headers);

    return responseJson;
  }

}
