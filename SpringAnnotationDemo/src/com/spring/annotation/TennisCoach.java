package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default contructor");
	}
	
	// define setter method
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach: inside setFortuneService() method");
//		this.fortuneService = fortuneService;
//	}

//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
