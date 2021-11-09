package com.human.character;

public class Cat implements Character {

	// 정보창을 구현합니다.
	private int experience=40; // 냥냥이의 경험치
	private int energy=50; // 냥냥이의 에너지
	private int level=1; // 냥냥이의 레벨

	@Override
	public void eat() { // 먹을때 에너지 25증가
		energy += 25;
		System.out.println("야옹! 배고프다냥");
		System.out.println("");

	}

	@Override
	public void sleep() {
		energy +=10; // 잘때 에너지 10증가
		System.out.println("집사야 불꺼라");
		System.out.println("");
	}

	@Override
	public void play() {
		energy -= 30; // 놀때 힘들어서 에너지 30감소
		experience += 35;
		System.out.println("다른장남감 없냐..질린다");
		System.out.println("더 빨리 움직여봐!");
		System.out.println("");

	}

	@Override
	public void train() {
		energy -= 20; // 훈련할때 힘들어서 에너지 20감소
		experience += 20;
		System.out.println("귀찮다냥 그만할래");
		System.out.println("냥냥이 다이어트 성공");
		System.out.println("");
	}
	@Override
	public void levelUp() {
		if (experience > 60) { // 레벨업이 에너지 60초과하면
			experience -=40; // 쌓인값에서 40을 빼고
			level++; // 레벨을 1업 시켜줍니다.
			System.out.println("레벨업!! " + level); // 레벨업!! 축하해
			System.out.println("");
		}
	}
	@Override
	public boolean endGame() {
		boolean returnValue = true;
		if (level > 4) { // 레벨이 4가 되면 성장합니다.
			System.out.println("냥냥이가 주인님이 되었습니다");
			returnValue = false;

		} else if (energy < 0) { // 에너지가 0이되면 죽게됩니다.
			System.out.println("냥냥이가 굶어 죽었습니다ㅠㅠ");
			returnValue = false;
		}
		return returnValue;
	}

	@Override
	public void printInfo() {
		System.out.println("====================");
		System.out.println("     냥냥이 상태참      ");
		System.out.println(" experience: " + experience);
		System.out.println(" energy: " + energy);
		System.out.println(" level: " + level);
		System.out.println("====================");

	}

}
