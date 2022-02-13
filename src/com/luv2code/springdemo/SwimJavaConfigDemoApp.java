package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean from container
		SwimCoach myCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//run method
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		System.out.println("Email is " + myCoach.getEmail());
		System.out.println("Team is " + myCoach.getTeam());
		
		//close context
		context.close();
	}

}
