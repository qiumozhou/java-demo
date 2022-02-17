package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.entity.UserExample;
import com.example.demo.service.UserService;
import common.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author qiumozhou
 * @version 1.0
 * @email 15717163552@163.com
 * @date 2022/2/16 上午11:49
 */
@RestController
@EnableAutoConfiguration
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser/{id}")
    public JsonResult<User> GetUser(@PathVariable int id){
        User user = userService.getUserByID(id);
        return new JsonResult<>(user);
    }

    @GetMapping("/getUserList")
    public JsonResult<List<User>> GetUserList(){
        UserExample userExample = new UserExample();
        List<User>  userList = userService.getUserList(userExample);
        return new JsonResult<>(userList);
    }
}
