package strategy1.step2;

import singleton2.SencondClass;

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
			if(robot instanceof SuperRobot) {
				SuperRobot tempRobot = (SuperRobot)robot;
				tempRobot.actionFly();
				tempRobot.actionMssile();
				tempRobot.actionKnife();
			}else if (robot instanceof StandardRobot) {
				StandardRobot tempRobot = (StandardRobot)robot;
				tempRobot.actionFly();
				tempRobot.actionMssile();
				tempRobot.actionKnife();
			}else if (robot instanceof LowRobot) {
				LowRobot tempRobot = (LowRobot)robot;
				tempRobot.actionFly();
				tempRobot.actionMssile();
				tempRobot.actionKnife();
			}// if
		}//for
	}//main
}
