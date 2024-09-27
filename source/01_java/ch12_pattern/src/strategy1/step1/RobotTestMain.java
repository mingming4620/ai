package strategy1.step1;

public class RobotTestMain {
	public static void main(String[] args) {
		SuperRobot superRobot = new SuperRobot();
		StandardRobot standardRobot = new StandardRobot();
		LowRobot lowRobot = new LowRobot();
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.actionFly();
		superRobot.actionMssile();
		superRobot.actionKnife();
		//-------------------------
		standardRobot.shape();
		standardRobot.actionWalk();
		standardRobot.actionRun();
		standardRobot.actionFly();
		standardRobot.actionMssile();
		standardRobot.actionKnife();
		//----------------------------
		lowRobot.shape();
		lowRobot.actionWalk();
		lowRobot.actionRun();
		lowRobot.actionFly();
		lowRobot.actionMssile();
		lowRobot.actionKnife();
	}	
}
