package strategy1.step5.mdularization;
import strategy1.step4.interfaces.*;
public class LowRobot extends Robot{	
	public LowRobot() {
			//setI(10); 					i=10;
			setFly(new FlyNo()); 		//fly =		new FlyNo();
			setMissile(new MissileNo()); //missile = 	new MissileNo();
			setKnife(new KnifeNo()); 	//knife = 	new KnifeNo();
	}

	@Override
	public void shape() {
		System.out.println("= = 로우로봇의 외형은 팔, 다리, 머리, 몸통이 있습니다 = = ");
		
	}
}







