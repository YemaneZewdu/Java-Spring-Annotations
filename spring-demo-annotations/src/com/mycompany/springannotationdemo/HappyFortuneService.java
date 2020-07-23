package com.mycompany.springannotationdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Constructor @Autowiring Injection";
	}

}
