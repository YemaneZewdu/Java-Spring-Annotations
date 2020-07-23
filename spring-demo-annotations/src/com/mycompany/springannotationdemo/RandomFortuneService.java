package com.mycompany.springannotationdemo;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String [] fortunes = {"The journey is the reward!", 
			"Keep pushing","Belive you can do it"};
	
	// random number generator
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		int index = random.nextInt(fortunes.length);
		String fortune = fortunes[index];
		return fortune;
	}

}
