package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //get bean from spring container
       // Coach coach = context.getBean("sellytennisCoach",Coach.class); Named
        Coach coach = context.getBean("tennisCoach",Coach.class);// use name of the class with lower case 1st letter
        //call a method on bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        Coach coach1 = context.getBean("tennisCoachSetterInjection",Coach.class);// use name of the class with lower case 1st letter
        //call a method on bean
        System.out.println(coach1.getDailyWorkout());
        System.out.println(coach1.getDailyFortune());
    //close the context
        context.close();
    }
}
