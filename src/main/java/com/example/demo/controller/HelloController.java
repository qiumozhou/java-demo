package com.example.demo.controller;


import com.example.demo.model.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping(value = "/")
    public String hello(){
        return "Hello World!";
    }

    @PostMapping("/post")
    public String index(@RequestBody User user){
        System.out.println("user name is:"+user.getName());
        System.out.println("user age is:"+user.getAge());
        return "Hello "+user.getName();
    }

    /**
     * 通过HttpServletRequest接收
     * @param request
     * @return
     */
    @GetMapping("/get")
    public String test(HttpServletRequest request){
        String username = request.getParameter("username");
        System.out.println("username is:"+username);
        return "Hello "+username;
    }

}
