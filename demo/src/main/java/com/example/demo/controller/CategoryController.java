package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/secure/test")
    public String secureTest() {
        return "✅ You have accessed a secured endpoint!";
    }
}
