package Singleton2;
public class SecondClass {
	public SecondClass() {
		System.out.println("SecondClass 생성자 실행 중 - - - ");
		SingletonClass secondSingletonObj = SingletonClass.getInstance();
		System.out.println("싱글톤 객체의 i값은"+ secondSingletonObj.getI() );
	}
}
