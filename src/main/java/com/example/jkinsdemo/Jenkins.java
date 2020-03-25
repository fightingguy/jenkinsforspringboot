package com.example.jkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jenkins {
    @GetMapping("/hello")
    public String helloa(){
        return "hello world";
    }
}
