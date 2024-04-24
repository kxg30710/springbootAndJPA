package com.in28Minutes.SpringFramework.learnspringframework.HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {

}

record Address(String line1, String city) {

}

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Kavitha";
	}

	@Bean
	public int age() {
		return 32;
	}

	/*
	 * @Bean public Person person() { var person = new Person("Ravi", 20); return
	 * person; }
	 */

	/*
	 * @Bean public Person person() { var person = new Person(name(), age(),
	 * address()); return person; }
	 */

	@Bean
	@Qualifier("personWithQualifier")
	public Person personWithParameters(String name, int age, Address address1) {
		var person = new Person(name, age, address1);
		return person;
	}

	@Bean
	@Primary
	public Person person() {
		var person = new Person("Vasee", 33, new Address("Diego Ct", "Columbia"));
		return person;
	}

	@Bean(name = "address1")
	public Address address() {
		var address = new Address("Bakers Streek", "London");
		return address;
	}

}
