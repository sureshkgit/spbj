package com.pr.spbj.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home/")
public class HomeController {

    //Happy Thanksgiving Day 24 Nov 2022
    @GetMapping
    public String hello() {
        return "Greetings!";
    }


    @GetMapping ("hi")
    public String hi() {
        return "Hi";
    }
}
