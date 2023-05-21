package com.jikim.study;

import com.jikim.study.game.GameRunner;
import com.jikim.study.game.MarioGame;

public class AppGamingBasicJava {
	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}
}
