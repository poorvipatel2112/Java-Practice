package com.argus.MedicalApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements  Coach{
    @Override
    public String getDailyWorkout() {
        return "try  practice it three days a week";
    }
}
