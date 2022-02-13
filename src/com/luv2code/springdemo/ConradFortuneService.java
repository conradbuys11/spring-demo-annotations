package com.luv2code.springdemo;

public class ConradFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "If you code today, you'll probably be ok.";
	}

}
