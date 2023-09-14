package com.argus.MedicalApp;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "You need to complete 3 set of squats today";
    }
}
