package com.jikim.study;

import com.jikim.study.game.GameRunner;
import com.jikim.study.game.MarioGame;

public class AppGamingBasicJava {
	public static void main(String[] args) {
		// 1. Object Creation
		var marioGame = new MarioGame();
		// 2. Object Creation + Wiring of Dependencies
		// Game is a Dependency of GameRunner
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}
}
