package adobesign.api.rest.sample.util;

import java.io.IOException;
import java.io.OutputStream;

/**
 * A writer that ensures (for common println methods) that the line separator is always CRLF, as required by multi-part payloads. There is
 * no close method. Callers must close the output streams that this writer wraps.
 */
public class MultiPartWriter {
  // The output stream in which to write.
  private OutputStream outStream;

  /**
   * Constructs this writer as a wrapper over the specified output stream.
   */
  MultiPartWriter(OutputStream outStream) {
    this.outStream = outStream;
  }
  
  /**
   * Writes a string to the output stream as ASCII (the default encoding for multi-part bodies).
   * 
   * @param x The string.
   * @throws IOException
   */
  public void print(String x) throws IOException {
    outStream.write(x.getBytes("US-ASCII"));
  }

  /**
   * Writes a line separator, always a carriage return + line feed combination.
   * 
   * @throws IOException
   */
  public void println() throws IOException {
    print("\r\n");
  }
  
  /**
   * Writes the given string followed by a line separator.
   * 
   * @param x The string to write.
   * @throws IOException
   */
  public void println(String x) throws IOException {
    print(x);
    println();
  }
  
  /**
   * Writes <code>len</code> bytes from the specified byte array starting at offset <code>off</code> to the output stream.
   * 
   * @param data The raw data to be written.
   * @param off The start offset in the data.
   * @param len The number of bytes to write.
   * @throws IOException
   */
  public void write(byte[] data, int off, int len) throws IOException {
    outStream.write(data, off, len);
  }
}
