package strategy1.step3;
//indexOf(), lastIndexOf(), substring(), replace(), replaceAll() // 자주쓰는 함수
public abstract class Robot {

	public void shape() {
		String className = getClass().getName(); // 클레스 이름 : "strategy1.step2.Robot" 을 부분 찾아내는 함수가 밑에있음.
		int idx = className.lastIndexOf("."); //맨 마지막 "."의 위치
		String name = className.substring(idx+1); // idx+1번째 부터 끝까지 스트링 추출
		System.out.println(name +"의 외형은 팔, 다리, 머리, 몸통이 있습니다. = = =");
	}
	public void actionWalk() {
		System.out.println("걸을 수 있습니다.");
	}
	public void actionRun() {
		System.out.println("달릴 수 있습니다.");
	}
	public abstract void actionFly();// 추상메소드 : 구현부가 없고 선언만 한 메소드
	public abstract void actionMissile();
	public abstract void actionKnife();
}
