package com.lec.ex3_speakerTv;

public class Tv implements IVolume {
	private int volumeLevel;
	private final int MAX_SPEAKER_VOLUME = 100;
	private final int MIN_SPEAKER_VOLUME = 0;

	public Tv() {
		volumeLevel = 10; // Tv초기화 볼륨
	}

	@Override
	public void volumeUp() { // 1씩 증가
		if (volumeLevel < MAX_SPEAKER_VOLUME) {
			volumeLevel++;
			System.out.println("Tv 볼륨을 1만큼 올려 현재" + volumeLevel);
		} else {
			System.out.println("Tv 볼륨이 최대치여서 올리지 못했습니다.");
		} // if
	}// volumeup

	@Override
	public void volumeUp(int i) { // 볼륨을 i씩 up
		if (volumeLevel == MAX_SPEAKER_VOLUME) {
			System.out.println("Tv 볼륨이 최대치(" + MAX_SPEAKER_VOLUME + ") 이여서 못올립니다. ");
		} else if (volumeLevel + i <= MAX_SPEAKER_VOLUME) {
			volumeLevel += i;
			System.out.println("Tv 볼륨을 " + i + "올려 현재 볼륨은 " + volumeLevel);
		} else {
			int temp = MAX_SPEAKER_VOLUME - volumeLevel; // 현재 증가 가능한 정도
			volumeLevel = MAX_SPEAKER_VOLUME;
			System.out.println("Tv 볼륨을 " + temp + "만큼올려 최대치입니다.");
		}
	}

	@Override
	public void volumeDown(int i) {
		if (volumeLevel == MIN_SPEAKER_VOLUME) {
			System.out.println("Tv 볼륨이 최소치(" + MIN_SPEAKER_VOLUME + ") ");
		} else if (volumeLevel - i >= MIN_SPEAKER_VOLUME) {
			volumeLevel -= i;
			System.out.println("Tv 볼륨을 " + i + " 내려 현재 볼륨은 " + volumeLevel);
		} else {
			int temp = volumeLevel - MIN_SPEAKER_VOLUME;
			System.out.println("Tv 볼륨을 " + temp + "만큼내려 최대치입니다.");
		} // if
	}// volumeDown

	@Override
	public void volumeDown() { // 1씩 감소
		if (volumeLevel > MIN_SPEAKER_VOLUME) {
			volumeLevel--;
			System.out.println("Tv 볼륨을 1만큼 내려 현재 " + volumeLevel);
		} else {
			System.out.println("Tv 볼륨이 최소치여서 내리지 못했습니다.");
		} // if
	}// volumeDown
}
