package com.mycompany.springannotationdemo;

// this class uses no special annotations to show 
// Bean definition with Java Config file
public class BasketBallCoach implements Coach {

	private FortuneService fortuneService;
	
	public BasketBallCoach(FortuneService theFortuneService) {
		 fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
	
		return "Work on 3 pointers";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
