package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConradConfig {
	
	@Bean
	public FortuneService fortuneService() {
		return new ConradFortuneService();
	}
	
	@Bean
	public ConradCoach myCoach() {
		return new ConradCoach(fortuneService());
	}
	
}
