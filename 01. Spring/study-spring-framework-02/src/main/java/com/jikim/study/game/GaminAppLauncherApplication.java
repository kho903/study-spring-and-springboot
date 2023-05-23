package com.jikim.study.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
