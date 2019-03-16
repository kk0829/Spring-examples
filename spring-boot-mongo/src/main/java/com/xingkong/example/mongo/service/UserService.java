package com.xingkong.example.mongo.service;

import com.xingkong.example.mongo.domain.User;
import com.xingkong.example.mongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wanggan
 * @create 2019-03-16 22:57
 */
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void create() {
        User user = repository.save(new User(1, "张三", 20));
        System.out.println("创建成功");
        System.out.println(user);
    }

}
