package singleton2;

public class TsetMain {
	public static void main(String[] args) {
		FirstClass firstObj = new FirstClass();
		SencondClass sencondObj = new SencondClass();
		SingletonClass singObj = SingletonClass.getInstance();
		System.out.println("main함수에서 싱글톤객체 i값은" + singObj.getI());
	}
}
