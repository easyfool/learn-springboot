package com.wangfengbabe.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSender {

    @Autowired
    private JavaMailSender javaMailSender;

    public String send(String sender, String receiver, String title, String mailBody) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        System.out.println("发送者");
        simpleMailMessage.setFrom(sender);
        System.out.println("接收者");
        simpleMailMessage.setTo(receiver);
        simpleMailMessage.setSubject(title);
        simpleMailMessage.setText(mailBody);
        javaMailSender.send(simpleMailMessage);
        return "success";

    }





}
