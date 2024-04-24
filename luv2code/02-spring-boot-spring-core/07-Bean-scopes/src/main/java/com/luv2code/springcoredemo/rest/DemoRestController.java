package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoRestController(@Qualifier("cricketCoach") Coach myCoach,
                              @Qualifier("cricketCoach") Coach anotherCoach) {
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkOut();
    }

    @GetMapping("/check")
    public String check(){
    return "Comparing beans : myCoach and anotherCoach" + (myCoach == anotherCoach);
    }
}
