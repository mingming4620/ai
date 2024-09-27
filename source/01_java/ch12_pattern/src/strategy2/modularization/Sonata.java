package strategy2.modularization;

import strategy2.interfaces.*;

public class Sonata extends Car{
	
	public Sonata() {
		setEng(new EngineMid());
		setKml(new Kmlmpl_15());
		setFue(new FuelGasoline());
	}
}
