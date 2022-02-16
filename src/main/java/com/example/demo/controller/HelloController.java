package com.example.demo.controller;


import com.example.demo.model.User;
import common.utils.JsonResult;
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
    public JsonResult<User> index(@RequestBody User user){
        return new JsonResult<>();
    }

    /**
     * 通过HttpServletRequest接收
     * @param request
     * @return
     */
    @GetMapping("/get")
    public JsonResult<User> test(){
        User user  = new User("aaa",18);
        System.out.println("11111111");
        return new JsonResult<>(user);
    }

    @GetMapping("/user")
    public User getUserList(){
        User user = new User("aa",1);
        return user;
    }
}
