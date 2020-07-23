package com.mycompany.springannotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasketBallJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config file	
		// instead of an XML file, we use the Java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the spring container
		// calling the method in SportConfig class
		Coach theCoach = context.getBean("basketBallCoach",Coach.class);
	
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		


		//close the context
		context.close();
	}

}
