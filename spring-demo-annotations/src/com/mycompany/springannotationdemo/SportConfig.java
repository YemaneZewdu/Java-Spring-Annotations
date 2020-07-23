package com.mycompany.springannotationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// this will enable the project to run without using XML file
// Spring will scan the classes that have @Component and store them in the container
@ComponentScan("com.mycompany.springannotationdemo")
public class SportConfig {

	// define bean for SadFortuneService class
	// Spring will take the method name and assign it in the container
	@Bean
	public FortuneService sadFortuneService() {
		return  new SadFortuneService();
	}
	
	// define bean for SwimCoach and Inject the dependency
	@Bean
	public Coach basketBallCoach() {
		// sadFortuneService() will get us the reference to the bean
		return new BasketBallCoach(sadFortuneService());
	}
	
	
	
}
