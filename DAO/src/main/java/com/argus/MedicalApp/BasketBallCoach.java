package com.argus.MedicalApp;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BasketBallCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "play basketball daily";
    }
}
