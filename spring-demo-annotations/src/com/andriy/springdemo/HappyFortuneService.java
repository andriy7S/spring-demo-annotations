package com.andriy.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {		
		return "Today is your another lucky day!";
	}

}
