package pkg07_char_copy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharCopyEx {

  public static void main(String[] args) {
    
    File origin = new File("C:\\Program Files\\Java\\jdk-17", "LICENSE");
    File copy = new File("\\storage", origin.getName());
    
    try (FileReader in = new FileReader(origin);
         BufferedWriter out = new BufferedWriter(new FileWriter(copy))) {
      
      char[] cbuf = new char[2];
      int readChar = 0;
      while ( (readChar = in.read(cbuf)) != -1 ) {
        out.write(cbuf, 0, readChar);
      }
      
      System.out.println(copy.getPath() + " 파일 복사 완료");
      
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
