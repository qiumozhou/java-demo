package com.example.demo.controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping("/index")
    public String index(){
        return "Hello qmz!";
    }

}
