package strategy1.step5.modularization;

import strategy1.step4.interfaces.*;

//indexOf(), lastIndexOf(), substring(), replace(), replaceAll() // 자주쓰는 함수
public abstract class Robot {

	private FlyImpl fly;
	private MissileImpl missile;
	private KnifeImpl knife;
	public abstract void shape(); //추상메소드
	
	public void actionWalk() {
		System.out.println("걸을 수 있습니다.");
	}

	public void actionRun() {
		System.out.println("달릴 수 있습니다.");
	}


	public void actionFly() {
		fly.Fly();
	}

	public void actionMissile() {
		missile.Missile();

	}

	public void actionKnife() {
		knife.Knife();

	}

	public void setFly(FlyImpl fly) {
		this.fly = fly;

	}

	public void setMissile(MissileImpl missile) {
		this.missile = missile;

	}

	public void setKnife(KnifeImpl knife) {
		this.knife = knife;

	}
}

