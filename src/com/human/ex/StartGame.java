package com.human.ex;

import com.human.character.Dog1;
import com.human.character.PlayGame;
import com.human.play.MakeCharacter;
import com.human.character.Character;

public class StartGame { //클래스 구현하고 메인메서드에서 실행합니다.

	public static void main(String[] args) {
		
		PlayGame pg = new PlayGame();
		MakeCharacter mc = new MakeCharacter();
		Character selectCharacter = mc.selectCharacter();
		pg.play(selectCharacter);
	}
}