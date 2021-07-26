package com.guigu.mybatisplus;

import com.atguigu.mybatisplus.Application;
import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ZhangShuai
 * @create 2021/7/26 19:43
 */
@SpringBootTest(classes = Application.class)
public class MybatisTest {

    @Resource
   private UserMapper userMapper;

    @Test
    public void a(){
        User user = userMapper.selectById(1l);
        System.out.println(user);

    }

    @Test
    public void insert(){
        User user = new User();

        user.setAge(18);

        userMapper.insert(user);
        System.out.println("id：" + user.getId()); //id自动回填

    }
    @Test
    public void select(){

        User user = new User();
        user.setId(1l);

        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));

        users.forEach(System.out::println);

        Map<String,Object> map = new HashMap<>();
        map.put("name","helen");
        map.put("age", 18);
        List<User> users1 = userMapper.selectByMap(map);
        users1.forEach(System.out::println);



    }

    @Test
    public void testUpdate(){

        User user = new User();
        user.setId(1L);
        user.setAge(38);

        //注意：update时生成的sql自动是动态sql
        int result = userMapper.updateById(user);
        System.out.println("影响的行数：" + result +user);

    }
    @Test
    public void testSelectAllByName(){
        List<User> users = userMapper.selectAllByName("Helen");
        users.forEach(System.out::println);
    }

    @Test
    public void delete(){
        int i = userMapper.deleteById(1);

    }
}
