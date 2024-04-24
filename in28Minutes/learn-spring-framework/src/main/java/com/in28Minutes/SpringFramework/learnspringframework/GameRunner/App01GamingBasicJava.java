package com.in28Minutes.SpringFramework.learnspringframework.GameRunner;

import com.in28Minutes.SpringFramework.learnspringframework.game.GameRunner;
import com.in28Minutes.SpringFramework.learnspringframework.game.Pacman;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// var game = new Mario();
		var game = new Pacman();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
