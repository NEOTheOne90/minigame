package com.human.character;

public class Dog1 implements Character {

	private int experience = 40; // 멍멍이의 경험치
	private int energy = 50; // 멍멍이의 에너지
	private int level = 1; // 멍멍이의 레벨

	@Override
	public void eat() { // 먹을때 에너지 25증가
		energy += 25;
		System.out.println("멍멍! 다먹을거야");
		System.out.println("");

	}

	@Override
	public void sleep() {
		energy += 10; // 잘때 에너지 10증가
		System.out.println("꿈나라 ZZZ");
		System.out.println("");
	}

	@Override
	public void play() {
		energy -= 30; // 놀때 힘들어서 에너지 30감소
		experience += 30;
		System.out.println("너무 힘들어..그만놀자");
		System.out.println("신난다!! 더 놀자!!");
		System.out.println("");

	}

	@Override
	public void train() {
		energy -= 20; // 훈련할때 힘들어서 에너지 20감소
		experience += 20;
		System.out.println("훈련강도 조절실패..");
		System.out.println("멍멍이 훈련성공!");
		System.out.println("");

	}

	@Override
	public void levelUp() {
		if (experience > 60) { // 레벨업이 에너지 60초과하면
			experience -= 40; // 쌓인값에서 40을 빼고
			level++; // 레벨을 1업 시켜줍니다.
			System.out.println("레벨업!! " + level); // 레벨업!! 축하해
			System.out.println("");
		}

	}

	@Override
	public boolean endGame() {
		boolean returnValue = true;
		if (level > 4) { // 레벨이 4가 되면 성장합니다.
			System.out.println("애기멍멍이가 큰멍멍이로 성장");
			returnValue = false;

		} else if (energy < 0) { // 에너지가 0이되면 죽게됩니다.
			System.out.println("멍멍이가 굶어 죽었습니다ㅠㅠ");
			returnValue = false;
		}
		return returnValue;
	}

	@Override
	public void printInfo() {
		System.out.println("====================");
		System.out.println("     멍멍이 상태참      ");
		System.out.println(" experience: " + experience);
		System.out.println(" energy: " + energy);
		System.out.println(" level: " + level);
		System.out.println("====================");

	}
}
