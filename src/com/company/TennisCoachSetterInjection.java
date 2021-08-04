package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachSetterInjection implements Coach{

    private FortuneService fortuneService;

    /**
     * adding default constructor
     * @return
     */

    public TennisCoachSetterInjection() {
        System.out.println(">> TennisCoachSetterInjection : -- Inside default const");
    }

    //create setter method for injection
    /*@Autowired
    public void setFortuneService(FortuneService fortuneService){
        System.out.println(">> TennisCoachSetterInjection : -- Inside setFortuneService");
        this.fortuneService= fortuneService;
    }*/

    //we can inject using any name
    @Autowired
    public void ds(FortuneService fortuneService){
        System.out.println(">> TennisCoachSetterInjection : -- Inside ds");
        this.fortuneService= fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "TennisCoach : DailyWorkout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
