package com.xingkong.example.session.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author wanggan
 * @create 2019-03-08 22:21
 */
@RestController
public class IndexController {

    @GetMapping(value = "/hello")
    public String sayHello() {
        return "hello world";
    }

    @GetMapping(value = "/sessionId")
    public String getSessionId(HttpSession session) {
        return session.getId();
    }

    @GetMapping(value = "/session")
    public Object setSession(@RequestParam(value = "name", defaultValue = "zhangsan") String name, HttpSession session) {
        session.setAttribute("name", name);

        return session.getAttribute("name");
    }
}
