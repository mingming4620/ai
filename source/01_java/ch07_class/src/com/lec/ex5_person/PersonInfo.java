package com.lec.ex5_person;
//) name, age, gender, birth를 데이터로 갖고, 데이터 정보를 출력하는 print() 메소더를 갖는 PersonInfo 클래스를 구현하고 
//main함수를 이용하여 test 구현하시오(print() 메소드 실행 결과 : 이름=홍길동, 나이=20, 성별=m, main 메소드 안에는 PersonInfo형 객체 인스턴스를 배열로 구현해 봅니다)
public class PersonInfo {
	private String name;
	private int age;
	private char gender; // 한문자
	private String birth;
	//생성자
	public PersonInfo(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public PersonInfo(String name, int age, char gender, String birth) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.birth = birth;
	}
	//메소드
	public void print() { // 객체 정보 출력 메서드
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + (gender == 'm' ? "남자" : "여자"));
		System.out.println("생년월일 : " + birth);
	}
	public String infoString() { //객체 정보를 스트링으로 바꿔서 return
		String result = "이름 :" + name;
		result += "\n나이 :" + age;
		result += "\n성별 :" + (gender == 0? "남자" : "여자");
		result += "\n생년월일 :" + (birth == null ? "-" : birth);
		return result;
//		return "이름 : " + name + 
//		"\n나이 : " + age +
//		"\n성별 : " + (gender == 'm' ? "남자" : "여자") +
//		"\n생년월일 : " + birth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
}
