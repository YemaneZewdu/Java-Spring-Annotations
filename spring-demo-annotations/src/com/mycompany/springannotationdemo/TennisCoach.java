package com.mycompany.springannotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("theTennisCoach") used before
@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// constructor injection
	// Spring will scan for a component that implements FortuneService interface 
	// changed to using setter injection
	/* 
	  @Autowired
	 
	public TennisCoach(FortuneService theFortuneService) {
		 fortuneService = theFortuneService;
	}
	*/
	
	public TennisCoach() {
		 System.out.println("Inside Tennis Coach default constructor");
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice backhand and Ace serving";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// we can use any method as long as we have the annotation
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Tennis Coach setter method");
		this.fortuneService = fortuneService;
	}
	
	

}
