package com.mins.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import oops_examples.four_pillars;

@SpringBootApplication
@ComponentScan(basePackages = { "oops_examples", "javabrains", "learnspringboot" })
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);

		four_pillars obj = new four_pillars();
		obj.doSomething();
		obj.encapsulationExample();
		obj.inheritanceExample();
		obj.polymorphismExample();
		obj.interfaceExample();
		obj.abstractExample();
	}

}
