package strategy2.modularization;

import strategy2.interfaces.EngineHigh;
import strategy2.interfaces.FuelGasoline;
import strategy2.interfaces.Kmlmpl_10;

public class Genesis extends Car{
	
	public Genesis() {
		setEng(new EngineHigh());
		setKml(new Kmlmpl_10());
		setFue(new FuelGasoline());
	}

}
