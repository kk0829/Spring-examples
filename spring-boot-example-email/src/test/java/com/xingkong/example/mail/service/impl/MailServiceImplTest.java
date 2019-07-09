package com.xingkong.example.mail.service.impl;

import com.xingkong.example.mail.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceImplTest {

    @Autowired
    private MailService mailService;

    @Test
    public void sendSimpleMail() {
        mailService.sendSimpleMail("244098979@qq.com", "hello", "world");
    }

    @Test
    public void sendHtmlMail() {
        String content = "<html><head></head><body><h2>hello world</h2></body></html>";
        mailService.sendHtmlMail("244098979@qq.com", "hello world", content);
    }
}