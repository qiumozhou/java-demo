package com.example.demo.service;


import com.example.demo.entity.User;
import com.example.demo.entity.UserExample;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


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

    public List<User> getUserList(){
        return userMapper.selectPage();
    }

    public int updateUser(User user){
        return userMapper.updateByPrimaryKey(user);
    }

    public int addUser(User user){
        return userMapper.insert(user);
    }

    public int deleteUser(int id){
        return userMapper.deleteByPrimaryKey(id);
    }

    public long getCount(UserExample example){
        return userMapper.countByExample(example);
    }

    public List<User> searchUser(int page,int limit,String username){
        return userMapper.searchUser(page,limit,username);
    }

    public Long getUserCountBySearch(String username){
        return userMapper.getUserCountBySearch(username);
    }

}
