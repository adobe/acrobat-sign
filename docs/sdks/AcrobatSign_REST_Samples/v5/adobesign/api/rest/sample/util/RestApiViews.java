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

package adobesign.api.rest.sample.util;

import java.util.HashMap;

import org.json.simple.JSONObject;

/**
 * Encapsulates calls to REST end points related to views.
 * It contains the utility functions which are used in file 'GetUrlForManagePage.java' to generate URL for manage page,
 * 'GetUrlForSettingsPage.java' to generate URL for settings page and 'GetUrlForViewAgreementAssetPage.java' to generate URL for
 * view agreement asset page
 */
public class RestApiViews {
  private static final String VIEWS_ENDPOINTS = "/views";
  private static final String VIEW_AGREEMENT_ASSET_ENDPOINTS = "/agreementAssets";
  private static final String VIEW_MANAGE_PAGE_ENDPOINTS = "/agreementAssetList";
  private static final String VIEWS_SETTINGS_ENDPOINTS = "/settings";

  /**
   * Get the URL for View Page of an Agreement Asset.
   * 
   * @param accessToken
   *          Access token of the user.
   * @param requestBody
   *          Request body in JSON format.
   * @return JSON response containing the URL for View Agreement Asset Page.
   * @throws Exception
   */
  public static JSONObject getUrlForAgreementAssetViewPage(String accessToken, JSONObject requestBody) throws Exception {
    // URL to Views Agreement Asset REST end point.
    String url = RestApiUtils.SERVICES_BASE_URL + VIEWS_ENDPOINTS + VIEW_AGREEMENT_ASSET_ENDPOINTS;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.ACCESS_TOKEN.toString(), accessToken);
    headers.put(RestApiUtils.HttpHeaderField.CONTENT_TYPE.toString(), RestApiUtils.MimeType.JSON.toString());

    // Invoke API and get JSON response.
    JSONObject responseJSON = null;
    responseJSON = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.POST, headers, requestBody.toString());

    return responseJSON;
  }

  /**
   * Get the URL for Manage Page.
   * 
   * @param accessToken
   *          Access token of the user.
   * @param requestBody
   *          Request body in JSON format.
   * @return JSON response containing the URL for Manage Page.
   * @throws Exception
   */
  public static JSONObject getUrlForManagePage(String accessToken, JSONObject requestBody) throws Exception {

    // URL to Views Manage Page REST end point.
    String url = RestApiUtils.SERVICES_BASE_URL + VIEWS_ENDPOINTS + VIEW_MANAGE_PAGE_ENDPOINTS;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.ACCESS_TOKEN.toString(), accessToken);
    headers.put(RestApiUtils.HttpHeaderField.CONTENT_TYPE.toString(), RestApiUtils.MimeType.JSON.toString());

    // Invoke API and get JSON response.
    JSONObject responseJSON = null;
    responseJSON = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.POST, headers, requestBody.toString());

    return responseJSON;
  }

  /**
   * Get the URL for Account Settings page and User Profile page.
   * 
   * @param accessToken
   *          Access token of the user.
   * @param requestBody
   *          Request body in JSON format.
   * @return JSON response containing the URL for Settings Page.
   * @throws Exception
   */
  public static JSONObject getUrlForSettingsView(String accessToken, JSONObject requestBody) throws Exception {
    // URL to Views Settings REST end point.
    String url = RestApiUtils.SERVICES_BASE_URL + VIEWS_ENDPOINTS + VIEWS_SETTINGS_ENDPOINTS;

    // Create header list.
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(RestApiUtils.HttpHeaderField.ACCESS_TOKEN.toString(), accessToken);
    headers.put(RestApiUtils.HttpHeaderField.CONTENT_TYPE.toString(), RestApiUtils.MimeType.JSON.toString());

    // Invoke API and get JSON response.
    JSONObject responseJSON = null;
    responseJSON = (JSONObject) RestApiUtils.makeApiCall(url, RestApiUtils.HttpRequestMethod.POST, headers, requestBody.toString());

    return responseJSON;
  }

}
