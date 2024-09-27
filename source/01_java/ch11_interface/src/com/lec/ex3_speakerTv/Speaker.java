package com.lec.ex3_speakerTv;

public class Speaker implements IVolume {
	private final int SPEAKER_MAX_VOLUME = 100;
	private final int SPEAKER_MIN_VOLUME = 0;
	private int volumeLevel;

	public Speaker() {
		volumeLevel = 5;
	}
	@Override
	public void volumeUp() {
		if (volumeLevel < SPEAKER_MAX_VOLUME) {
			volumeLevel++;
			System.out.println("스피커 볼륨을 1만큼 올려 현재" + volumeLevel);
		} else {
			System.out.println("스피커 볼륨이 최대치여서 올리지 못했습니다");
		}
	}
	@Override
	public void volumeUp(int i) { // 볼륨을 i씩 up
		if (volumeLevel == SPEAKER_MAX_VOLUME) {
			System.out.println("스피커 볼륨이 최대치(" + SPEAKER_MAX_VOLUME + ") 이여서 못올립니다. ");
		} else if (volumeLevel + i <= SPEAKER_MAX_VOLUME) {
			volumeLevel += i;
			System.out.println("스피커 볼륨을 " + i + "올려 현재 볼륨은 " + volumeLevel);
		} else {
			int temp = SPEAKER_MAX_VOLUME - volumeLevel; // 현재 증가 가능한 정도
			volumeLevel = SPEAKER_MAX_VOLUME;
			System.out.println("스피커 볼륨을 " + temp + "만큼올려 최대치입니다.");
		}
	}

	@Override
	public void volumeDown(int i) {
		if (volumeLevel == SPEAKER_MIN_VOLUME) {
			System.out.println("스피커 볼륨이 최소치(" + SPEAKER_MIN_VOLUME + ") ");
		} else if (volumeLevel - i >= SPEAKER_MIN_VOLUME) {
			volumeLevel -= i;
			System.out.println("스피커 볼륨을 " + i + " 내려 현재 볼륨은 " + volumeLevel);
		} else {
			int temp = volumeLevel - SPEAKER_MIN_VOLUME;
			System.out.println("스피커 볼륨을 " + temp + "만큼내려 최대치입니다.");
		} // if
	}// volumeDown

	@Override
	public void volumeDown() {
		if (volumeLevel > SPEAKER_MIN_VOLUME) {
			volumeLevel--;
			System.out.println("스피커 볼륨을 1만큼 내려 현재 " + volumeLevel);
		} else {
			System.out.println("스피커 볼륨이 최소치여서 내리지 못했습니다.");
		}
	}
}