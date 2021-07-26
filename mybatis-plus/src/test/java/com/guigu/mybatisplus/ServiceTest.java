package com.guigu.mybatisplus;

import com.atguigu.mybatisplus.Application;
import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangShuai
 * @create 2021/7/26 20:43
 */
@SpringBootTest(classes = Application.class)
public class ServiceTest {

    @Autowired
    UserService userService;
    @Test
    public  void count(){
        int count = userService.count();
        System.out.println(count);
    }

    @Test
    public  void SaveBatch(){
       List<User> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            User user = new User();
            user.setName("Helen" + i);
            user.setAge(10 + i);
            list.add(user);
        }
        userService.saveBatch(list);

    }
    @Test
    public void testListAllByName(){
        List<User> users = userService.listAllByName("Helen");
        users.forEach(System.out::println);
    }

}
