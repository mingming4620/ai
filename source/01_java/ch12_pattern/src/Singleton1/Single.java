package singleton1;
/* data(데이터)메모리 영역	| heap(힙)메모리 영역 
 *  클래스(설계도) static	| 일반 변수 */
public class Single {
	private int i;
	private Single() {}
	private static Single INSTENCE = new Single(); // 많이 쓰는 싱글톤 패턴!!!!
	public static Single getInstance() {
		return INSTENCE;
	}
//	private static Single INSTANCE; //싱글톤패턴 구동코드 기본값 null
//	public static Single getInstance() {
//		//객체를 생성 안 했으면 객체를 생성하고 그 주소를 return
//		//객체를 생성했으면, 그 객체 주소를 return
//		if(INSTANCE == null) {
//			INSTANCE = new Single();
//		}
//		return INSTANCE; // 불러낸 getInstance 로 return
//	}
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}
