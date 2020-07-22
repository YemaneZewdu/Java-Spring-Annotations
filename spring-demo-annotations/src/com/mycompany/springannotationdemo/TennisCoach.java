package com.mycompany.springannotationdemo;

import org.springframework.stereotype.Component;

@Component("theTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice backhand and Ace serving";
	}

}
