package strategy1.step5.mdularization;

import strategy1.step4.interfaces.*;

public abstract class Robot {
	private Flylmpl fly;
	private MissileImpl missile;
	private KnifeImpl 	knife;
	public abstract void shape();
	public void actionWalk() {
		System.out.println("걸을 수 있습니다");
	}
	public void actionRun() {
		System.out.println("달릴 수 있습니다");
	}
	public void actionFly() {
		fly.fly();
	}
	public void actionMssile() {
		missile.missile();
	}
	public void actionKnife() {
		knife.knife();
	}
	public void setFly(Flylmpl fly) {
		this.fly = fly;
	}
	public void setMissile(MissileImpl missile) {
		this.missile = missile;
	}
	public void setKnife(KnifeImpl knife) {
		this.knife = knife;
	}
}





