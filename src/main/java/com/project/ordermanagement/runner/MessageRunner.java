package com.project.ordermanagement.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		
		int age = 10;
		System.out.println("This is second added message, age is"+age);
     
	}

}
