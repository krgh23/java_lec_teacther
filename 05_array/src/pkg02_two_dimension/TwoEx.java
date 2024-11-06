package pkg02_two_dimension;

public class TwoEx {

  public static void main(String[] args) {
    
    // 2차원 배열 : 테이블 형태로 이해 (실제로는 1차원 배열이 여러 개 존재)
    
    // 배열 선언
    String[][] seats;
    
    // 배열 생성
    seats = new String[3][2];  // 3행 2열의 테이블로 이해 (길이가 2인 1차원 배열이 3개)
    
    // 배열 요소 : 1행의 2개 데이터 (1번째 1차원 배열의 요소)
    seats[0][0] = "A1";
    seats[0][1] = "A2";
    
    // 배열 요소 : 2행의 2개 데이터 (2번째 1차원 배열의 요소)
    seats[1][0] = "B1";
    seats[1][1] = "B2";
    
    // 배열 요소 : 3행의 2개 데이터 (3번째 1차원 배열의 요소)
    seats[2][0] = "C1";
    seats[2][1] = "C2";
    
    /*
        A1  A2  ->  1차원 배열 (seats[0])
        B1  B2  ->  1차원 배열 (seats[1])
        C1  C2  ->  1차원 배열 (seats[2])
    */
    
    // 2차원 배열을 구성하는 1차원 배열 확인
    
    // 1번째 1차원 배열
    for(int j = 0; j < seats[0].length; j++) {
      System.out.print(seats[0][j] + " ");
    }
    System.out.println();  // 줄 바꿈
    
    // 2번째 1차원 배열
    for(int j = 0; j < seats[1].length; j++) {
      System.out.print(seats[1][j] + " ");
    }
    System.out.println();  // 줄 바꿈
    
    // 3번째 1차원 배열
    for(int j = 0; j < seats[2].length; j++) {
      System.out.print(seats[2][j] + " ");
    }
    System.out.println();  // 줄 바꿈
      
    // 2차원 배열 순회1 - 일반 for 문
    for(int i = 0; i < seats.length; i++) {
      for(int j = 0; j < seats[i].length; j++) {
        System.out.print(seats[i][j] + " ");
      }
      System.out.println();
    }
    
    // 2차원 배열 순회2 - Advanced for 문
    
      
      
      
      
      
      
      
      
      

  }

}
