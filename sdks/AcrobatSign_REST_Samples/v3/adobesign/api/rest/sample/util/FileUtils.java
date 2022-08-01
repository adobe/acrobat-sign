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

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Utility methods to make file-related calls.
 * 
 * <p>
 * <b>IMPORTANT</b>: Check that the output location in the field <code>OUTPUT_PATH</code> below is suitable.
 * </p>
 */
public class FileUtils {
  // Platform-dependent file-path separator.
  public final static String FILE_SEP = System.getProperty("file.separator");

  // Location where output files are saved. Default is a sub-folder in the system temp folder.
  public final static String OUTPUT_PATH = getDefaultOutputPath();

  // The package path from which to read any input files.
  public final static String REQUEST_PATH = "adobesign/api/rest/sample/requests/";

  public final static String AUDIT_FILES_OUTPUT_PATH = OUTPUT_PATH + "auditTrails" + FILE_SEP;
  public final static String AGREEMENT_DOCS_OUTPUT_PATH = OUTPUT_PATH + "agreementDocuments" + FILE_SEP;
  public final static String LIB_DOCS_OUTPUT_PATH = OUTPUT_PATH + "libraryDocuments" + FILE_SEP;
  public final static String ARCHIVED_FILES_OUTPUT_PATH = OUTPUT_PATH + "archival" + FILE_SEP;
  public final static String FORM_DATA_OUTPUT_PATH = OUTPUT_PATH + "formData" + FILE_SEP;
  
  /**
   * Parses the specified file to a JSON object. The file must contain a JSON structure for use as the request body (input) in the REST API
   * calls.
   * 
   * @param fileName Name of the file containing the JSON structure.
   * @return JSONObject obtained from the file's contents.
   * @throws IOException
   * @throws ParseException
   */
  public static JSONObject getRequestJson(String fileName) throws IOException, ParseException {
    JSONObject json = null;
    InputStreamReader reader = null;
    try {
      JSONParser parser = new JSONParser();
      // Create the pointer to the file containing sample JSON relative to FileUtils.java
      String name = REQUEST_PATH + fileName;

      reader = new InputStreamReader(ClassLoader.getSystemResourceAsStream(name));
      json = (JSONObject) parser.parse(reader);
    }
    catch (ParseException e) {
      System.err.print(RestError.GENERAL_PARSING_ERROR.errMessage);
      throw e;
    }
    finally {
      if (reader != null)
        reader.close();
    }
    return json;
  }

  /**
   * Saves bytes to the specified location with the specified name.
   * 
   * @param filedata Data bytes to be saved to disk.
   * @param dirPath Folder location where the file is to be saved; must end in a path separator.
   * @param fileName Name with which the file is to be saved.
   * @return True if successful, false otherwise.
   * @throws IOException
   */
  public static boolean saveToFile(byte[] fileData, String dirPath, String fileName) throws IOException {
    // Attempt to save only if data is not null and output directory exists
    if (fileData != null && ensureDirectoryExists(dirPath)) {
      BufferedOutputStream outStream = null;
      try {
        outStream = new BufferedOutputStream(new FileOutputStream(dirPath + fileName));
        outStream.write(fileData, 0, fileData.length);
        return true;
      }
      catch (IOException e) {
        System.err.println(RestError.INPUT_OUTPUT_EXCEPTION.errMessage);
        throw e;
      }
      finally {
        if (outStream != null)
          outStream.close();
      }
    }

    // One of the inputs is probably invalid.
    return false;
  }

  /**
   * Check if the specified directory exists. If not, create it.
   * 
   * @param dirPath The directory.
   * @return True if success, false otherwise.
   */
  private static boolean ensureDirectoryExists(String dirPath) {
    File path = new File(dirPath);
    if (path.exists() && path.isDirectory())
      return true;
    else
      return path.mkdirs();
  }
  
  /**
   * Returns the root path in which to store output files. Includes a trailing path separator.
   */
  private static String getDefaultOutputPath() {
    String outputPath = System.getProperty("java.io.tmpdir");
    if (outputPath == null || outputPath.isEmpty())
      outputPath = "." + FILE_SEP; // current directory
    else if (!outputPath.endsWith(FILE_SEP))
      outputPath += FILE_SEP;

    // Add a suitable sub-directory.
    outputPath = outputPath + "AdobeSignRestSamplesOutput" + FILE_SEP;

    return outputPath;
  }
}
