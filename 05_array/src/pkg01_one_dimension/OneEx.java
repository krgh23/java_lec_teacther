package pkg01_one_dimension;

public class OneEx {

  public static void main(String[] args) {
    
    // 1차원 배열 : 하나의 인덱스를 사용하는 배열
    
    // 배열 선언
    String[] members;  // 참조 변수 members 하나가 생성된다.
    
    // 배열 생성
    members = new String[4];  // 힙(heap) 영역에 연속된 4개 공간이 생기고 해당 참조를 members 변수에 할당한다.
    
    // 배열 요소 (배열이름 + 인덱스)
    members[0] = "지수";
    members[1] = "로제";
    members[2] = "리사";
    members[3] = "제니";
    
    System.out.println(members[0]);
    System.out.println(members[1]);
    System.out.println(members[2]);
    System.out.println(members[3]);
    
    
    
    
    

  }

}
