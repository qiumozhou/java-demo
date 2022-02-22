package com.example.demo;



import componets.redis.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;


@SpringBootTest
class JaveDemoApplicationTests {

    @Resource
    RedisTemplate<String,Object> redisTemplate;


    @Test
    void contextLoads() {
          RedisUtil redisUtil = new RedisUtil(redisTemplate);
          redisUtil.set("name","qmz");
          System.out.println("name is :"+ redisUtil.get("name"));
    }


}
