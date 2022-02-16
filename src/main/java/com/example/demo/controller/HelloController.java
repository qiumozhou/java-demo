package com.example.demo.controller;


import com.example.demo.model.User;
import common.utils.JsonResult;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


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
    @GetMapping("/user")
    public JsonResult<User> test(){
        User user  = new User("aaa",18);
        return new JsonResult<>(user);
    }

    @GetMapping("/userList")
    public JsonResult<ArrayList> getUserList(){
        User user1 = new User("aa",1);
        User user2 = new User("bb",2);
        ArrayList<User> arr = new ArrayList<User>();
        arr.add(user1);
        arr.add(user2);
        return new JsonResult<>(arr);
    }
}
