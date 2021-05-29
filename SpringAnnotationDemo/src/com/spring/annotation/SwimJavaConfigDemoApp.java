package com.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		//read spring config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve bean from spring container
		Coach coach=context.getBean("swimCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(coach.getDailyWorkout());
		
		// call method to get the daily fortune
		System.out.println(coach.getDailyFortune());
		
		// call our new mthods ... has the props values injected
		System.out.println("email: "+((SwimCoach) coach).getEmail());
		System.out.println("team: "+((SwimCoach) coach).getTeam());
		
		// close the context
		context.close();
		
	}

}
