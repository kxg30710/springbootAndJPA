package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach myCoach;


    @Autowired
    public DemoRestController(@Qualifier("cricketCoach") Coach myCoach) {
        this.myCoach = myCoach;

    }

    @PostConstruct
    public void doAfterInitialization(){
        System.out.println("In doAfterInitialization()" + getClass().getSimpleName());
    }

    @PreDestroy
    public void doBeforeBeanDestroy(){
        System.out.println("In doBeforeBeanDestroy() " + getClass().getSimpleName());
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkOut();
    }


}
