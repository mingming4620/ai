package com.lec.ex7_customer;

// new Customer("홍", '010-9999-9999', "서울", "12-12")
public class Customer extends Person {
	private String address;
	private int sum; //구매금액 누적
	private int point; // 포인트(구매금액의 1%)
	private String date; // String을 다음주부터는 날짜형 
	private boolean vip; // true면 vip고객, false면 일반고객
	public Customer(String address, String date, String name, String tel) {
		super(name, tel);
		this.address = address;
		this.date = date;
		point = 1000;
		System.out.println(name + "님 가입 감사 포인트 무려 1000점 드렸습니다");
	}
	public void buy(int price) {
		sum += price; // 구매금액 누적
		if(vip==false && sum>=Constant.VIPLIMIT) {
			vip = true;
				System.out.println(getName() + "님 VIP로 업그레이드 되셨습니다");
		}
		int thisPoint = (int)(price * Constant.POINTRATE);//금번포인트
		point += thisPoint; // 포인트누적
		System.out.println(getName() + "님 감사, 구매액 : " + price);
		System.out.println("금번 포인트 : " + thisPoint);
		System.err.println("누적포인트 : " + point);
		System.err.println("누적금액 : " + sum);
	}
	@Override
	public String infoString() {
		String result = super.infoString() + "[포인트]" + point + "[구매누적]" + sum;
		result += (vip) ? "VIP 고객이십니다" : "";
		return result;
	}
	}
