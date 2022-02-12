package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	//init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Inside of init method.");
	}
	
	//destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Inside my destroy method.");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Work on your backhand.";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
