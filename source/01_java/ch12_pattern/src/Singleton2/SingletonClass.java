package singleton2;

public class SingletonClass {
	private int i;
	private static SingletonClass INSTANCE; // INSTANCE는 getter setter 안해도됨
	private SingletonClass() {
		i = 10;
	}
	public static SingletonClass getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new SingletonClass();
		}
		return INSTANCE;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
}
