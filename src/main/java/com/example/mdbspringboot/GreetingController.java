package com.example.mdbspringboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class GreetingController {

    @RequestMapping("/")
    public String getGreeting() {
        return "Din pappa är en apa";
    }
}
