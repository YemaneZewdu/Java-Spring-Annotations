package com.mycompany.springannotationdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// this will enable the project to run without using XML file
// Spring will scan the classes that have @Component and store them in the container
@ComponentScan("com.mycompany.springannotationdemo")
public class SportConfig {

	
}
