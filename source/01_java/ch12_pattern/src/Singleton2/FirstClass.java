package singleton2;

public class FirstClass {
	public FirstClass() {
		System.out.println("FirstClass 생성자 실행중 ------");
		SingletonClass FirstsingletonObj = SingletonClass.getInstance();
		System.out.println("싱글톤 객체의 i값 : " + FirstsingletonObj.getI());
		FirstsingletonObj.setI(999);
		System.out.println("싱글톤 객체의 수정한 i값 " + FirstsingletonObj.getI());
	}
}
