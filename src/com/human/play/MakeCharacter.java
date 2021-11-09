package com.human.play;

import java.util.Scanner;
import com.human.character.Dog1;
import com.human.character.Cat;
import com.human.character.Character;

public class MakeCharacter {
	public Character selectCharacter() {
		Scanner sc = new Scanner(System.in);
		Character returnValue = null;
		
		// 변수 선언하고 메뉴에서 캐릭터 선택시에 해당 클래스를
		//returnValue에 넣어 불러오게 합니다.
		
		System.out.println("캐릭터를 선택하세요");
		System.out.println("1.귀여운 멍멍이");
		System.out.println("2.까칠한 야옹이");
		String ch = sc.nextLine();

		switch (ch) {
		case "1":        
			returnValue = new Dog1();
			break;
		case "2":
			returnValue = new Cat();
			break;
		}
		return returnValue;
	}
}