package com.iluv2code.MyCoolApp.rest;

import ch.qos.logback.core.CoreConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    //expose "/" that return "Hello World

    @GetMapping("/")
    public String displayHello(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5K!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day";
    }
}
