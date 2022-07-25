/*************************************************************************
 * ADOBE SYSTEMS INCORPORATED
 * Copyright 2014 Adobe Systems Incorporated
 * All Rights Reserved.
 * 
 * NOTICE: Adobe permits you to use, modify, and distribute this file in accordance with the
 * terms of the Adobe license agreement accompanying it. If you have received this file from a
 * source other than Adobe, then your use, modification, or distribution of it requires the prior
 * written permission of Adobe.
 **************************************************************************/

package adobesign.api.rest.sample;

import org.json.simple.JSONObject;

import adobesign.api.rest.sample.util.FileUtils;
import adobesign.api.rest.sample.util.RestApiOAuthTokens;
import adobesign.api.rest.sample.util.RestApiWidgets;
import adobesign.api.rest.sample.util.RestError;

/**
 * This sample client demonstrates how to download the form data of the specified widget.
 * 
 * <p>
 * <b>IMPORTANT</b>:
 * <ol>
 * <li>Before running this sample, check that you have modified the JSON file 'OAuthCredentials.json' with appropriate values. Which values need to be
 * specified is indicated in the file.</li>
 * <li>You can also provide OAuth access token in OAUTH_ACCESS_TOKEN variable in RestApiOAuthTokens class which will then be used as OAuth access token for making api calls.</li>
 * <li>You can also provide refresh token in OAUTH_REFRESH_TOKEN variable in RestApiOAuthTokens class to refresh OAuth access token. </li>
 * <li>Make sure that you have specified a valid widget ID in <code>widgetId</code> below.</li>
 * <li>Check that the default output location in the field <code>OUTPUT_PATH</code> of FileUtils.java is suitable.</li>
 * </ol>
 * </p>
 */
public class RetrieveFormDataOfWidget {
  // TODO: Enter a valid widget ID. Please refer to the "widgets" end-point in the API documentation to learn how to obtain IDs of
  // widgets present in Adobe Sign.
  private static String widgetId = "a valid widget ID";

  // File containing request body to get an access token.
  private static final String authRequestJSONFileName = "OAuthCredentials.json";

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      RetrieveFormDataOfWidget client = new RetrieveFormDataOfWidget();
      client.run();
    }
    catch (Exception e) {
      System.err.println("Error while retrieving form data for widget");
      e.printStackTrace();
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception {
    // Get oauth access token to make further API calls.
    String accessToken = RestApiOAuthTokens.getOauthAccessToken(authRequestJSONFileName);
    
    // Display name of the widget associated with the specified widget ID.
    JSONObject widgetInfo = RestApiWidgets.getWidgetInfo(accessToken, widgetId);
    String widgetName = (String) widgetInfo.get("name");
    System.out.println("Widget name: " + widgetName);
    
    String fileName = widgetName + "_" + System.currentTimeMillis() + ".csv";
    System.out.println("Saving form data '" + fileName + "'");
    
    // Make API call to get form data of this widget.
    byte formDataStream[] = RestApiWidgets.getFormdataForWidget(accessToken, widgetId);

    if (formDataStream != null) {
      boolean success = FileUtils.saveToFile(formDataStream, FileUtils.FORM_DATA_OUTPUT_PATH, fileName);
      if (success)
        System.out.println("Successfully saved form data in '" + FileUtils.FORM_DATA_OUTPUT_PATH + "'.");
      else
        System.err.println(RestError.FILE_NOT_SAVED.errMessage);
    }
    else {
      System.err.println("Error while retrieving form data for widget: " + widgetName);
    }
  }
}
