package com.mycompany.springannotationdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("theTennisCoach") used before 1
@Component
//@Scope("prototype")  // removed to use default scope 
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
	
	
	
	// init method
	@PostConstruct
	public void doInitStuff() {
		System.out.println("Inside doInitStuff method ");
	}
	
	
	// destroy method
	@PreDestroy
	public void doCleanupStuff() {
		System.out.println("Inside doCleanupStuff method ");
	}
	
	
	
	
	
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
