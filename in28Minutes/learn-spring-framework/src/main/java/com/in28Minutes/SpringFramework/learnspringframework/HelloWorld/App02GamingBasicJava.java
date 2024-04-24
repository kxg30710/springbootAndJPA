package com.in28Minutes.SpringFramework.learnspringframework.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingBasicJava {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

			System.out.println(context.getBean("name"));

			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address1"));

			System.out.println(context.getBean(Person.class));

			// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}

}
