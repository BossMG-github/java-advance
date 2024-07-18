package dataIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteOutputStreamEx01 {

  public static void main(String[] args) throws IOException {
    OutputStream outputStream = new FileOutputStream("C:\\Temp\\test.txt");
    OutputStream outputStream2 = new FileOutputStream("C:\\Temp\\test2.txt");
    byte a = 10;
    byte b = 20;
    byte c = 30;
    outputStream.write(a);
    outputStream.write(b);
    outputStream.write(c);
    outputStream.flush();
    outputStream.close();
    byte[] bytes = {10,20,30};
    outputStream2.write(bytes,1,2);
    outputStream2.flush();
    outputStream2.close();
  }
}
