package pkg09_Member;

public class Address {

  String zipCode;
  String roadAddr;
  String detailAddr;
  
  Address(String zipCode, String roadAddr, String detailAddr) {
    this.zipCode = zipCode;
    this.roadAddr = roadAddr;
    this.detailAddr = detailAddr;
  }
  
  void info() {
    System.out.println(zipCode);
    System.out.println(roadAddr + " " + detailAddr);
  }
  
}