package com.example.ex_5_hw.controller;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/public")
    public String user() {
        return "public";
    }
    @GetMapping("/private")
    public String admin(){
        return "private";
    }
}
