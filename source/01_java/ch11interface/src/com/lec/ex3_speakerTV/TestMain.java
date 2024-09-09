package com.lec.ex3_speakerTV;
public class TestMain {
	public static void main(String[] args) {
		IVolume[] devices = {new Speaker(), new Tv()};
		IVolume.changeBattery();
		for(IVolume device : devices) {
				device.volumeDown(50);
				device.volumeDown();
				device.volumeUp();
				device.volumeUp(50);
				device.setMute(true);
				device.setMute(false);
		}
	}
}
