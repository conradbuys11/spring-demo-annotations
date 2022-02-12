package com.luv2code.springdemo;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = {"Today will be great!", "Today is going to be rough.", "Make sure to eat spaghetti today."};
	
	//create rng
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//grab a random fortune from our array
		return fortunes[myRandom.nextInt(fortunes.length)];
	}

}
