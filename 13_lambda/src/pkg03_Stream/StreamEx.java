package pkg03_Stream;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * package java.util.stream;
 * 
 * public interface Stream<T> {
 *   Stream<T> filter(Predicate<T> predicate);  // Predicate 결과가 true 인 데이터만 Stream 으로 반환
 *   Stream<R> map(Function<T, R> mapper);      // Function 의 반환 결과를 Stream 으로 반환
 *   void forEach(Consumer<T> action);          // forEach 메소드를 호출한 Stream 의 모든 요소를 Consumer 로 하나씩 전달
 * }
 */

public class StreamEx {

  public static void a() {
    
    // Stream 인스턴스 생성
    Stream<String> s1 = Stream.of("캥거루", "코알라", "이구아나", "펭귄");
    
    String[] array = {"사과", "바나나", "복숭아", "망고"};
    Stream<String> s2 = Arrays.stream(array);
    
    List<String> list = Arrays.asList("한국", "일본", "중국", "베트남");
    Stream<String> s3 = list.stream();
    
    // forEach 메소드 활용
    s1.forEach(animal -> {
      System.out.println(animal); 
    });
    s2.forEach(fruit -> System.out.println(fruit));
    s3.forEach(nation -> System.out.println(nation));
    
    // 연습. JAVA_HOME 의 모든 디렉터리/파일 이름 출력하기
    File javaHome = new File("C:\\Program Files\\Java\\jdk-17");
    File[] files = javaHome.listFiles();
    Stream<File> s4 = Arrays.stream(files);
    s4.forEach(file -> System.out.println(file.getName()));
    
  }

  public static void b() {
    
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    numbers.stream()
      .filter(number -> number % 3 == 0)  // Stream 요소 중 number % 3 == 0 결과가 true 인 요소(3의 배수)만 별도 Stream 으로 반환
      .forEach(number -> System.out.println(number));
    
    // 연습. JAVA_HOME 의 디렉터리 이름 출력하기
    
    
  }
  
  public static void main(String[] args) {
    b();
  }

}
