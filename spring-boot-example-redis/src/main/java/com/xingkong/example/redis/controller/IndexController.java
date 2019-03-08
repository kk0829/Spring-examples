package com.xingkong.example.redis.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanggan
 * @create 2019-03-08 22:02
 */
@RestController
public class IndexController {

    @GetMapping(value = "/hello")
    @Cacheable(value = "hello-world")
    public String sayHello(@RequestParam(value = "username", defaultValue = "张三") String username) {
        System.out.println("第一次进入：没有缓存");
        return "Hello " + username;
    }
}
