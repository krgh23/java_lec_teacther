package pkg10_BankAccount;

public class BankAccount {

  String accNo;
  long balance;
  
  BankAccount(String accNo, long balance) {
    this.accNo = accNo;
    this.balance = balance;
  }
  
  /**
   * 입금 처리. 
   * @param money 입금액. 마이너스 금액 불가.
   */
  void deposit(long money) {
    if(money < 0)
      return;
    balance += money;
  }
  
  /**
   * 출금 처리.
   * @param money 출금액. 마이너스 출금 불가. 잔액보다 큰 금액 출금 불가.
   * @return 실제 출금액.
   */
  long withdrawal(long money) {
    if(money < 0)
      return 0L;
    if(money > balance)
      return 0L;
    balance -= money;
    return money;
  }
  
  /**
   * 이체 처리.
   * @param bankAccount 이체할 계좌 정보
   * @param money 이체할 금액
   */
  void transfer(BankAccount bankAccount, long money) {
    long withdrawalMoney = this.withdrawal(money);
    bankAccount.deposit(withdrawalMoney);
    // bankAccount.deposit(this.withdrawal(money));
  }
  
  /**
   * 계좌 조회. 계좌번호와 통장잔액을 출력.
   */
  void inquiry() {
    System.out.println("BankAccountNo: " + accNo);
    System.out.println("Balance: " + balance);
  }
  
}
