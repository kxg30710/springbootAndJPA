package com.luv2code.springcoredemo.common.config;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class swimConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();

    }
}
