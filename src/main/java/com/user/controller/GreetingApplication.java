package com.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingApplication {

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String getGreeting(){
        return "greeting";
    }

}
