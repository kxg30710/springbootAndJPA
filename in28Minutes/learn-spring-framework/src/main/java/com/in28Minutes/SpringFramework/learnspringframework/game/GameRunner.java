package com.in28Minutes.SpringFramework.learnspringframework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameRunner {

	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	@Bean
	public void run() {
		game.left();
		game.right();
		game.up();
		game.down();
	}

}
