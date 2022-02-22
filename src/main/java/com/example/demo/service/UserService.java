package com.example.demo.service;


import com.example.demo.entity.User;
import com.example.demo.entity.UserExample;
import com.example.demo.mapper.UserMapper;
import componets.redis.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    @Resource
    RedisTemplate<String,Object> redisTemplate;


    @Autowired
    UserMapper userMapper;
    public User getUserByID(int key){
        return userMapper.selectByPrimaryKey(key);
    }

    public List<User> getUserList(int page,int size){
        RedisUtil redisUtil = new RedisUtil(redisTemplate);
        Object object = redisUtil.get(String.valueOf(page)+"_"+String.valueOf(size));
        if(object==null){
            List<User> userList = userMapper.selectPage();
            redisUtil.set(String.valueOf(page)+"_"+String.valueOf(size),userList);
            System.out.println("***********没走缓存***********");
            return userList;
        }else{
            System.out.println(object);
            System.out.println("***********走了缓存***********");
            return (List<User>) object;
//            return userMapper.selectPage();
        }

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
