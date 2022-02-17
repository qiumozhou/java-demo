package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public User selectByPrimaryKey(UserKey key){
        return userMapper.selectByPrimaryKey(key);
    }
}