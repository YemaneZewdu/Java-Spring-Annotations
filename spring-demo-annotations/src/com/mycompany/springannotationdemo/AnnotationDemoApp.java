package com.mycompany.springannotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from the spring container
		//Coach theCoach = context.getBean("theTennisCoach",Coach.class);
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
	
		// used with value injection from properties file 
		//SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		


		//close the context
		context.close();
	}

}
