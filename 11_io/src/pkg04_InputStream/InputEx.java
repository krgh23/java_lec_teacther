package pkg04_InputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputEx {

  public static void a() {
    
    // 1 바이트씩 데이터 읽기
    
    // FileInputStream     : 파일 정보 읽는 스트림
    // BufferedInputStream : 입력 속도 향상을 위한 스트림
    
    File file = new File("\\storage", "sample.dat");
    
    BufferedInputStream in = null;
    
    try {
      
      in = new BufferedInputStream(new FileInputStream(file));
      
      // 읽을 단위 : int 변수로 1 바이트씩 읽는다.
      int c;
      
      // 읽은 데이터를 보관할 배열 : 배열의 길이를 파일의 크기와 맞춤
      byte[] b = new byte[(int) file.length()];
      int i = 0;
      
      // 파일의 종료까지 계속 읽기 : read() 메소드는 읽은 내용을 반환하거나, 파일이 종료되면 -1 을 반환한다.
      while( (c = in.read()) != -1 ) {
        b[i++] = (byte) c;
      }
      
      // 확인
      System.out.println(new String(b));
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(in != null)
          in.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void b() {
    
    // n 바이트씩 데이터 읽기
    
  }
  
  public static void main(String[] args) {
    a();
  }

}