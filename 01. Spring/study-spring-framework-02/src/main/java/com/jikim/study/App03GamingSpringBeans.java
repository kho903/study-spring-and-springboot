package com.jikim.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jikim.study.game.GameRunner;
import com.jikim.study.game.GamingConsole;

public class App03GamingSpringBeans {
	public static void main(String[] args) {
		try (var context =
				 new AnnotationConfigApplicationContext
					 		(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}
}
