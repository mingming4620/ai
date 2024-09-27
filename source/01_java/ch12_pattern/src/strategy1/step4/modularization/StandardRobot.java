package strategy1.step4.modularization;

import strategy1.step4.interfaces.*;

public class StandardRobot extends Robot {
	
	private FlyImpl fly;
	private	MissileImpl missile;
	private KnifeImpl knife;
	public StandardRobot() {
		setFly(new FlyYes());			//fly = new FlyNo();
		setMissile(new MissileYes());   //missile = new MissileNo()
		setKnife(new KnifeWood());		//knife = new KnifeNo()
		
		
	}
	
	@Override
	public void actionFly() { 
		fly.Fly();
	}
	
	@Override
	public void actionMissile() { 
		missile.Missile();
	}
	
	@Override
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
