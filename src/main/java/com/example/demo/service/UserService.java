package com.example.demo.service;


import com.example.demo.entity.User;
import com.example.demo.entity.UserExample;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author qiumozhou
 * @version 1.0
 * @email 15717163552@163.com
 * @date 2022/2/16 上午11:49
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User getUserByID(int key){
        return userMapper.selectByPrimaryKey(key);
    }

    public List<User> getUserList(UserExample example){
        return userMapper.selectByExample(example);
    }
}
