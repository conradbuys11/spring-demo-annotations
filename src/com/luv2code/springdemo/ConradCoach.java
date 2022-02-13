package com.luv2code.springdemo;

public class ConradCoach implements Coach {

	private FortuneService fortuneService;
	
	public ConradCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Work out the brain. Do coding practice.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void sayAllTheThings() {
		System.out.println(getDailyWorkout());
		System.out.println(getDailyFortune());
	}

}
