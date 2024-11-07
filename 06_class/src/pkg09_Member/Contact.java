package pkg09_Member;

public class Contact {

  String tel;
  String mobile;
  
  Contact() {
    
  }
  
  Contact(String mobile) {
    // this.mobile = mobile;
    this(null, mobile);
  }
  
  Contact(String tel, String mobile) {
    this.tel = tel;
    this.mobile = mobile;
  }
  
  void info() {
    System.out.println("Tel: " + (tel == null ? "없음" : tel));
    System.out.println("Mobile: " + (mobile == null ? "없음" : mobile));
  }
  
}
