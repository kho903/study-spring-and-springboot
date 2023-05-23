package com.jikim.study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jikim.study.game.GameRunner;
import com.jikim.study.game.GamingConsole;
import com.jikim.study.game.PacManGame;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

}
