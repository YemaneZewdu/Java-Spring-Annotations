package com.mycompany.springannotationdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotionBeanScopeDemoApp {

	public static void main(String[] args) {
		// read spring config file

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from the spring container
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
	
		
		// check if they are the same
		// expected result is 'True' because the default scope is Singleton
		// but after we put '@Scope("prototype")' in Tennis Coach class, the 
		// scope is changed
		System.out.println("Pointing to the same object: " + (theCoach == alphaCoach));
		
		


		//close the context
		context.close();

	}

}
