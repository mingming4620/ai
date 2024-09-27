package strategy1.step4.modularization;

import strategy1.step4.interfaces.FlyHigh;
import strategy1.step4.interfaces.KnifeStic;

public class RobotTestMain {
	public static void main(String[] args) {
		SuperRobot superRobot = new SuperRobot();
		StandardRobot standardRobot = new StandardRobot();
		LowRobot lowRobot = new LowRobot();
		Robot[] robots = {superRobot,standardRobot,lowRobot};
		for(Robot robot : robots) {
			robot.shape();
			robot.actionWalk();
			robot.actionRun();
			robot.actionFly();
			robot.actionMissile();
			robot.actionKnife();
		}//for
		System.out.println("SuperRobot의 나는 부품을 높이 나는 기능으로 업그레이드");
		superRobot.setFly(new FlyHigh());
		superRobot.shape();
		superRobot.actionFly();
		robots[0].actionFly();
		
		System.out.println("LowRobot의 검이 없는것을 장난감 검으로 업그레이드");
		lowRobot.setKnife(new KnifeStic());
		lowRobot.shape();
		lowRobot.actionKnife();
		
		
	}//main
}
