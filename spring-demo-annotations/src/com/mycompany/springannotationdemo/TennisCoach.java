package com.mycompany.springannotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("theTennisCoach") used before 1
@Component
public class TennisCoach implements Coach {
	
	@Autowired
	// this will tell Spring to inject this bean Id specifically *3*
	// default name is a small cased class name we want to inject 
	@Qualifier("randomFortuneService")
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
	/* moved to using field injection 2
	 
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Tennis Coach setter method");
		this.fortuneService = fortuneService;
	}
	*/
	
	

}
