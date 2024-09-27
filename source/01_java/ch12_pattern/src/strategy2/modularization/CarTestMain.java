package strategy2.modularization;

import strategy2.interfaces.FuelHyrid;
import strategy2.interfaces.Kmlmpl_20;

public class CarTestMain {
	public static void main(String[] args) {
		Genesis genesis = new Genesis();
		Sonata sonata = new Sonata();
		Casper casper = new Casper();
		Car[] cars = {genesis, sonata, casper};
		for(Car car : cars) {
			car.shape();
			car.drive();
			car.acengine();
			car.acKmlmp();
			car.acfuellmp();
		}
		System.out.println(" 소나타 유종을 FuelHybrid로 연비를 20km/l로 교체");
			sonata.setFue(new FuelHyrid());
			sonata.setKml(new Kmlmpl_20());
			for(Car car : cars) {
				car.shape();
				car.drive();
				car.acengine();
				car.acKmlmp();
				car.acfuellmp();
			}
	}
}
