package com.let.ex4_account;
// 데이터 (인스턴스 변수) : accountNo(String), ownerName(String), balance(long)
// 생성자 new Account ("010-777-77", "홍길동"), new Account("010-777-77", "홍길동", 100)
// 기능(메소드) : deposit(예금), withdraw(인출), infoPrint(정보출력), infoString(정보문자열 변환)
public class Account {
	private String accountNo; // 계좌번호
	private String ownerName; // 예금주
	private long   balance;  // 예금 잔액
	// 생성자 없으면 JVM이 디폴트 생성자 함수 자동생성
//	public Account() {} // 디폴트 생성자 함수
	public Account(String accountNO, String ownerName) {
		this.accountNo = accountNO;
		this.ownerName = ownerName;
	}
	public Account (String accountNo, String ownerName, long balance ) { 
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	public void deposite(long money) { // 무조건 예금하기
	balance += money;	//balance = balance + money;
	System.out.println(money + "원 예금하여 잔액 : " + balance);
	}
	public void withdraw(long money) throws Exception { // 잔액이 있을 경우만 인출하기
		if(balance >= money) {
			balance -= money; //balance = balance - money;
			System.out.println(money + "원 인출하여 잔액 : " + balance);
		}else {
			//ch14에서는 강제 예외 발생
			throw new Exception("예외메시지 : " + money + "원 인출하기엔 잔액("+balance+")부족합니다");
		} // if
	}// withdraw
	public void infoPrint() {
		//100-1 "홍길동"님 잔액 : 100 을 출력
//		System.out.println(accountNo + " \"" + ownerName + "\"님 잔액 : " + balance);
		System.out.printf("%s \"%s\"님 잔액 : %d\n", accountNo, ownerName, balance);
	}
	public String infoString() {
		//100-1 "홍길동"님 잔액 : 100을 return
//		return accountNo + " \"" + ownerName + "\"님 잔액 : " + balance;
		return String.format("%s \"%s\"님 잔액 : %d", accountNo, ownerName, balance);
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
}



