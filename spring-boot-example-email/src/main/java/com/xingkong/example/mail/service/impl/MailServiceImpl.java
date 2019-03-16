package com.xingkong.example.mail.service.impl;

import com.xingkong.example.mail.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.internet.MimeMessage;

/**
 * @author wanggan
 * @create 2019-03-11 22:50
 */
@Component
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender sender;

    private String from = "tzhwg0829@126.com";

    @Override
    public void sendSimpleMail(String to, String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);

        try {
            sender.send(message);
            System.out.println("邮件发送成功");
        } catch (Exception e) {
            System.out.println("邮件发送失败");
            System.out.println(e);
        }
    }

    @Override
    public void sendHtmlMail(String to, String subject, String content) {
        MimeMessage message = sender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content);

            sender.send(message);
            System.out.println("邮件发送成功");
        } catch (Exception e) {
            System.out.println("邮件发送失败");
            System.out.println(e);
        }
    }
}
