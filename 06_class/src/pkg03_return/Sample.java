package pkg03_return;

/*
 * 메소드 만드는 방법
 * 
 * 반환타입 메소드명([매개변수, ...]) {
 *   본문
 *   [return 반환값]
 * }
 */

public class Sample {

  /**
   * 반환이 void 인 경우 return; 을 통해 메소드 실행을 중지한다.
   * @param number 양의 정수를 전달 받는다. 음의 정수가 전달되면 사용하지 않는다.
   */
  void methodA(int number) {
    if(number < 0) {
      return;
    }
    System.out.println(number);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
