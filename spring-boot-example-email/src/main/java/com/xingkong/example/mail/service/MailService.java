package com.xingkong.example.mail.service;

/**
 * @author wanggan
 * @create 2019-03-11 22:50
 */
public interface MailService {
    void sendSimpleMail(String to, String subject, String content);
    void sendHtmlMail(String to, String subject, String content);
}
