package singleton2;

public class SencondClass {
	public SencondClass() {
		System.out.println("SencondClass 생성자 실행중 ------");
		SingletonClass senSingletonClassObj = SingletonClass.getInstance();
		System.out.println("싱글톤 객체의 i값은 :" +senSingletonClassObj.getI());
	}
}
