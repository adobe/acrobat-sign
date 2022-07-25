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

package adobesign.api.rest.sample.util;

/**
 * List of specific error cases and messages.
 */
public enum RestError {

  FILE_NOT_FOUND("Cannot find the given file at the specified location."),
  INPUT_OUTPUT_EXCEPTION("Unable to perform input output operation on the specified resource."),
  GENERAL_PARSING_ERROR("Error while parsing the specified object."),
  MALFORMED_URL("Unable to process request as URL is found malformed."),
  UNAUTHORIZED("You are not authorized to make this call. Get your access token first."),
  GENERAL_ERROR("Error occured while performing specified operation"),
  SEND_REMINDER_ERROR("Failure in sending reminders to the next participant of the specified agreement."),
  FILE_NOT_SAVED("Error while saving document to the location specified"),
  UNSUPPORTED_ENCODING("Unable to process request as encoding type is not supported.");

  public final String errMessage;

  RestError(String message) {
    this.errMessage = message;
  }
}
