package strategy2.modularization;

import strategy2.interfaces.*;

public class Car {
	
	public void drive(){
		String className=getClass().getName();
		int idx=className.lastIndexOf(".");
		String name = className.substring(idx+1);
		System.out.println(name+ "가 드라이브 하고 있습니다.");
	}
	public void shape() {
		String className=getClass().getName();
		int idx=className.lastIndexOf(".");
		String name = className.substring(idx+1);
		System.out.println(name+ "에는 door, sheet, handle이 있습니다.");
	}
	
	private EngineImpl eng;
	private Fuellmpl fue;
	private Kmlmpl kml;
	
	public void acengine() {
		eng.Emgine();
	}
	public void acfuellmp() {
		fue.Fuellmpl();
	}
	public void acKmlmp() {
		kml.Kmlmp();
	}
	
	public void setEng(EngineImpl eng) {
		this.eng = eng;
	}
	public void setFue(Fuellmpl fue) {
		this.fue = fue;
	}
	public void setKml(Kmlmpl kml) {
		this.kml = kml;
	}


	
	
}
