package com.human.character;

import java.util.Scanner;
import com.human.character.Character;
import com.human.character.Cat;
import com.human.character.Dog1;

public class PlayGame {

	private static Character character;
	private boolean flag = true;

	public void play(Character c) {
		character = c;
		Scanner sc = new Scanner(System.in);
		while (flag) {
			character.printInfo();
			System.out.println("1.밥먹이기 2.잠재우기 3.놀아주기 4.운동 5.종료");
			System.out.println("입력>>");
			String select = sc.nextLine();
			switch (select) {
			case "1":
				character.eat();
				break;
			case "2":
				character.sleep();
				break;
			case "3":
				character.play();
				break;
			case "4":
				character.train();
				break;
			case "5":
				flag = false;
				break;
			default:
				break;
			}
			character.levelUp();
			if (flag = true) {
				flag = character.endGame();
			}
		}
	}

}
