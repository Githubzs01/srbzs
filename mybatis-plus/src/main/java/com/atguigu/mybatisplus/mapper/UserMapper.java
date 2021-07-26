package com.atguigu.mybatisplus.mapper;

import com.atguigu.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author ZhangShuai
 * @create 2021/7/26 19:10
 */

public interface UserMapper  extends BaseMapper<User> {
    List<User> selectAllByName(String name);

}
