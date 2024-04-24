package com.in28Minutes.SpringFramework.learnspringframework.GameRunner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28Minutes.SpringFramework.learnspringframework.game.GamingConfiguration;
import com.in28Minutes.SpringFramework.learnspringframework.game.GamingConsole;

public class App02GamingSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {

			// System.out.println(context.getBean("game"));
			context.getBean(GamingConsole.class).up();

		}
		App02GamingSpring obj1 = new App02GamingSpring();
		App02GamingSpring obj2 = new App02GamingSpring();
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
	}

}
