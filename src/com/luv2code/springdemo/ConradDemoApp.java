package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConradDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConradConfig.class);
		ConradCoach coach = context.getBean("myCoach", ConradCoach.class);
		coach.sayAllTheThings();
		context.close();
		
	}

}
