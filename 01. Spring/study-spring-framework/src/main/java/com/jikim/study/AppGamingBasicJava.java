package com.jikim.study;

import com.jikim.study.game.GameRunner;
import com.jikim.study.game.MarioGame;
import com.jikim.study.game.PacManGame;
import com.jikim.study.game.SuperContraGame;

public class AppGamingBasicJava {
	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
		var superContraGame = new SuperContraGame();
		gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
		var pacManGame = new PacManGame();
		gameRunner = new GameRunner(pacManGame);
		gameRunner.run();
	}
}
