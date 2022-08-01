package adobesign.api.rest.sample.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Rudimentary helper class used to construct a multi-part body for use in an HTTP POST request containing a file as the payload. Note that
 * the output stream of the HTTP connection passed into the constructor is not closed by this class. The caller must close it when done.
 * 
 * <p>
 * Other than populating the request body, callers also need to set the multi-part boundary as an HTTP header. However this can only be done
 * before retrieving the connection's output stream. So the workflow should be:
 * <ol>
 * <li>Create an instance of this class.</li>
 * <li>Retrieve the boundary generated, using {@link #getBoundary()}, for use in the HTTP header.</li>
 * <li>Open the output stream on the connection and associate it with this class instance using {@link #setOutputStream(OutputStream)}.</li>
 * <li>Call the various add methods as required.</li>
 * <li>End with a call to {@link #endBody()}.</li>
 * </ol>
 * </p>
 */
public class MultiPartRequestBody {

  // The multi-part boundary value to use.
  private final String boundary = "MultiPartFileBoundary" + Long.toHexString(System.currentTimeMillis());

  // The writer that writes to the output stream.
  private MultiPartWriter writer;

  /**
   * Returns the boundary generated for use by the current instance of this class.
   */
  public String getBoundary() {
    return boundary;
  }

  /**
   * Sets the HTTP output stream for use by this class.
   * 
   * @param outStream Output stream of the HTTP connection. Callers must close the output stream themselves when done.
   * @throws IOException
   */
  public void setOutputStream(OutputStream outStream) throws IOException {
    writer = new MultiPartWriter(outStream);
  }

  /**
   * Adds a simple part to this multi-part message. In our usage this is typically meta-data associated with the file we want to send. The
   * name and value should only contain characters in the ASCII character set.
   * 
   * @param name The name to be given to the part.
   * @param value The value of the part.
   * @throws IOException
   */
  public void addMetaPart(String name, String value) throws IOException {
    writeBoundary(false);
    writer.println("Content-Disposition: form-data; name=\"" + name + "\"");
    writer.println();
    writer.print(value); // don't add a line separator here since that would be considered a part of the value.
  }

  /**
   * Adds a file to this multi-part message.
   * 
   * @param fileName The name to give the file after it is uploaded. Must contain ASCII characters only.
   * @param mimeType The file mime type.
   * @param file The file itself.
   * @throws IOException
   */
  public void addFilePart(String fileName, String mimeType, File file) throws IOException {
    writeBoundary(false);

    // Add the headers of the file part.
    writer.println("Content-Disposition: form-data; name=\"File\"; File-Name=\"" + fileName + "\"");
    writer.println("Content-Type: " + mimeType);
    writer.println("Content-Transfer-Encoding: binary");
    writer.println();

    // Append the file stream.. the document that will be uploaded to Adobe Sign.
    FileInputStream fileStream = new FileInputStream(file);
    try {
      byte[] data = new byte[4096];
      int bytesRead = fileStream.read(data);

      while (bytesRead >= 0) {
        writer.write(data, 0, bytesRead);
        bytesRead = fileStream.read(data);
      }
    }
    finally {
      fileStream.close();
    }
  }

  /**
   * Ends the request body by writing the final part boundary.
   * 
   * @throws IOException
   */
  public void endBody() throws IOException {
    writeBoundary(true);
  }

  /**
   * Writes the boundary to the output stream writer.
   * 
   * @param end True if this is the final boundary of the request body.
   * @throws IOException
   */
  private void writeBoundary(boolean end) throws IOException {
    // A boundary should always start and end with a line separator.
    writer.println();
    writer.println("--" + boundary + (end ? "--" : ""));
  }

}
