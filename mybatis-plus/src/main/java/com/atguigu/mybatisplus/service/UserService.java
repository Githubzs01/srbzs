package com.atguigu.mybatisplus.service;

import com.atguigu.mybatisplus.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author ZhangShuai
 * @create 2021/7/26 20:36
 */

public interface UserService  extends IService<User> {

    List<User> listAllByName(String name);
}
