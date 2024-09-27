package Singleton1;
public class SingleTestMain {
	public static void main(String[] args) {
		Single obj1 = Single.getInstance();
		Single obj2 = Single.getInstance();
		obj1.setI(99);
		System.out.println("obj1.i=" + obj1.getI());
		System.out.println("obj2.i=" + obj2.getI());
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 같다");
		}else {
			System.out.println("obj1과 obj2는 다르다");
		}
	}
}
