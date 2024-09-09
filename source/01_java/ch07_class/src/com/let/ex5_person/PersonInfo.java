package com.let.ex5_person;
// 데이터는 : name, age, gender, birth(String=>13장 수업후에는 Date형)
//  생성자 : new PersonInfo("홍길동", 22, 'm', "2001-12-01"), new PersonInfo("홍길동", 22, 'm') - 오버로딩
// 메소드 : print()
public class PersonInfo {
	private String name;
	private int    age;
	private char   gender; //한문자
	private String birth;
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
	public void print() { // 객체 정보 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + (gender=='m' ? "남자" : "여자"));
		System.out.println("생년월일 : " + birth);
	}
	public String infoString() { //객체 정보를 스트링으로 바뀌지 return
		String result = "이름 : " + name; 
		result += "\n나이 :" + age;
		result += "\n성별 :" + (gender=='m' ? "남자" : "여자");
		result += "\n생년월일 : " + (birth==null? "" : birth);
		return result;
//		return "이름 : " + name + 
//				"\n나이 : " + age +
//				"\n성별 : " + (gender=='m' ? "남자" : "여자") +
//				"\n생년월일 : " + birth;		
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