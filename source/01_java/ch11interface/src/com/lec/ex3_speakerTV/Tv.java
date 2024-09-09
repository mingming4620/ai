package com.lec.ex3_speakerTV;

public class Tv implements IVolume {
	private int volumeLevel;
	private final int MAX_VOLUME = 100;
	private final int MIN_VOLUME = 0;
	public Tv() {
		volumeLevel = 10;
	}
@Override
public void volumeUp() { // 1씩 증가
	if(volumeLevel < MAX_VOLUME) {
		volumeLevel++;
		System.out.println("TV 볼륨을 1올려 현재 볼륨은 " + volumeLevel);
	}else {
		System.out.println("TV 볼륨이 최대치("+MAX_VOLUME+")여서 올리지 못했습니다");
	}
}
@Override
public void volumeUp(int i) { // 볼륨을 i씩 up
	if(volumeLevel == MAX_VOLUME) {
		System.out.println("TV 볼륨이 최대치(" + MAX_VOLUME + ")이여서 못 올려요");
	}else if( (volumeLevel+i) <= MAX_VOLUME) {
		volumeLevel += i;
		System.out.println("TV 볼륨을 "+i+"만큼 올려 현재 볼륨은 " + volumeLevel);
	}else {
		int temp = MAX_VOLUME - volumeLevel; // 현재 증가 가능한 정도
		volumeLevel = MAX_VOLUME;
		System.out.println("TV 볼륨을 "+ temp + "만큼 올려 최대치입니다");
	}//if
}//volumeUp
@Override
public void volumeDown(int i) { // 볼륨을 i씩 Down
	if(volumeLevel == MIN_VOLUME) {
		System.out.println("TV 볼륨이 최소치(" + MIN_VOLUME + ")이여서 못 올려요");
	}else if(volumeLevel-i >= MIN_VOLUME) {
		volumeLevel -= i;
		System.out.println("TV볼륨을 " + i +"만큼 내려 현재 볼륨은 " + volumeLevel);
	}else { // 현재 볼륨=3, i=5
		int temp = volumeLevel - MIN_VOLUME; // 현재 감소 정도
		volumeLevel = MIN_VOLUME;
		System.out.println("TV볼륨을 " + temp +"만큼 내려 최소치입니다");
	}
	
}//volumeDown
@Override
public void volumeDown() {
	if(volumeLevel > MIN_VOLUME ) {
		volumeLevel--;
		System.out.println("TV 볼륨을 1만큼 내려 현재 볼륨은 " + volumeLevel);
	}else {
		System.out.println("TV 볼륨이 최소치(" + MAX_VOLUME +")여서 내리지 못했습니다");
	}//if
}//volumeDown
}//class









	
