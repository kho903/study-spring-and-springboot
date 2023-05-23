package com.jikim.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jikim.study.game.GameRunner;
import com.jikim.study.game.GamingConsole;

@Configuration
@ComponentScan("com.jikim.study.game")
public class GaminAppLauncherApplication {

	public static void main(String[] args) {
		try (var context =
				 new AnnotationConfigApplicationContext
					 		(GaminAppLauncherApplication.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}
}
