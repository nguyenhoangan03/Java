package com.luv2code.demo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice fast working for 15 minutes";
    }
}
