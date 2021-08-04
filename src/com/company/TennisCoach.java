package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("sellytennisCoach") Named
@Component
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    /**
     * Construtor injection
     * @param fortuneService
     */
    @Autowired
    public TennisCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
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
