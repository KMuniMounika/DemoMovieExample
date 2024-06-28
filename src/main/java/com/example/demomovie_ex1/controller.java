package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping("/home")
    public String home() {
        return "home"; // This will serve home.html
    }
    @GetMapping("/login")
    public String login() {
        return "login"; // This will serve home.html
    }

    @GetMapping("/booking")
    public String hello() {
        return "booking"; // This will serve name.html
    }

}
