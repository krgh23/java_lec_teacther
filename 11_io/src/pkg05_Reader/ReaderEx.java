package pkg05_Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderEx {

  public static void a() {
    
    File file = new File("\\storage", "a.txt");
    
    try (FileReader in = new FileReader(file)) {
      
      // 읽을 단위 : 2 글자씩 읽기
      char[] cbuf = new char[2];
      
      // 읽은 데이터를 저장할 StringBuilder
      StringBuilder builder = new StringBuilder();
      
      // 실제로 읽은 글자 수
      int readChar = 0;
      
      // read(char[]) : 읽은 글자들은 인자에 저장하고, 읽은 글자 수를 반환한다. 파일이 끝나면 -1 을 반환한다.
      while( (readChar = in.read(cbuf)) != -1 ) {
        builder.append(cbuf, 0, readChar);
      }

      // 확인
      System.out.println(builder.toString());
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void main(String[] args) {
    a();
  }

}
