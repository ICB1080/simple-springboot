package com.grace.simplespringboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/git")
    public String getMessage(){
        return "Hello from git";
    }

    @GetMapping("/git1")
    public String getMessage1(){
        return "Hello from git1";
    }
}
