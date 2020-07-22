package com.mycompany.springannotationdemo;

import org.springframework.stereotype.Component;

//@Component("theTennisCoach") used before
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice backhand and Ace serving";
	}

}
