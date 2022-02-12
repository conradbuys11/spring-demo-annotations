package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//call methods
		boolean result = (theCoach == alphaCoach);
		System.out.println(result);
		System.out.println("\n Memory location for first coach: " + theCoach);
		System.out.println("\n Memory location for second coach: " + alphaCoach);
		
		//close context
		context.close();
	}

}
