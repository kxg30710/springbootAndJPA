package com.iluv2code.MyCoolApp.rest;

import ch.qos.logback.core.CoreConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    //inject custom properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose "/" that return "Hello World
    @GetMapping("/")
    public String displayHello(){
        return "Hello" + coachName;
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return coachName + " Run a hard 5K!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return teamName + " Today is your lucky day";
    }
}
