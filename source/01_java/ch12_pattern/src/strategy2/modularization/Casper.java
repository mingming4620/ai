package strategy2.modularization;

import strategy2.interfaces.*;

public class Casper extends Car{
	
	public Casper() {
		setEng(new EngineHigh());
		setKml(new Kmlmpl_20());
		setFue(new FuelDiesel());
	}
}
