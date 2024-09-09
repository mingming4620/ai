package com.lec.ex4_actor;
//다형성 ex
public class ActorMain {
	public static void main(String[] args) {
	Actor park = new Actor("박보검");
	park.canCatchCriminal();
	park.canSearch();
	park.outFire();
	park.saveMan();
	park.makePizza();
	park.makeSpaghetti();
	IPoliceMan policePark = park;
	policePark.canCatchCriminal();
	policePark.canSearch();
//	policePark.outFire();
//	policePark.saveMan();
//	policePark.makePizza();
//	policePark.makeSpaghetti();
	IFireFighter fighterpark = park;
//	figterpark.canCatchCriminal();
//	figterpark.canSearch();
	fighterpark.outFire();
	fighterpark.saveMan();
//	fighterPark.makePizza();
//	fighterPark.makeSpaghetti();
	}
}
