package com.mycompany.springannotationdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Sad Fortune Service call :(";
	}

}
