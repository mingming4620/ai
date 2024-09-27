package strategy1.step5.modularization;

import strategy1.step4.interfaces.*;

public class StandardRobot extends Robot {
	
		public StandardRobot() {
		setFly(new FlyYes());			//fly = new FlyNo();
		setMissile(new MissileYes());   //missile = new MissileNo()
		setKnife(new KnifeWood());		//knife = new KnifeNo()
		
		
	}

		@Override
		public void shape() {
			System.out.println(" = = 기본로봇의 외형은 팔, 다리, 머리, 몸통이 있습니다.");			
		}
}
