package com.jikim.study;

import com.jikim.study.game.GameRunner;
import com.jikim.study.game.MarioGame;
import com.jikim.study.game.SuperContraGame;

public class AppGamingBasicJava {
	public static void main(String[] args) {
		// var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
	}
}
