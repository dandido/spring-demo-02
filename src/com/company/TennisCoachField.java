package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachField implements Coach{

    @Autowired
    private FortuneService fortuneService;

    public TennisCoachField() {
        System.out.println(">> TennisCoachSetterInjection : -- Inside default const");
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
