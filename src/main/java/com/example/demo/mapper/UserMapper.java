package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
 * @author qiumozhou
 * @version 1.0
 * @email 15717163552@163.com
 * @date 2022/2/16 上午11:51
 */
@Mapper
@Repository
public interface UserMapper {
    User Sel(int id);
}
