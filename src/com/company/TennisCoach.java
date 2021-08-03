package com.company;

import org.springframework.stereotype.Component;

//@Component("sellytennisCoach") Named
@Component
public class TennisCoach implements Coach{
    @Override
    public String DailyWorkout() {
        return "TennisCoach : DailyWorkout";
    }
}
