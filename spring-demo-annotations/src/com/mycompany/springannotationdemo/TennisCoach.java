package com.mycompany.springannotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("theTennisCoach") used before
@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// constructor injection
	// Spring will scan for a component that implements FortuneService interface 
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		 fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice backhand and Ace serving";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
