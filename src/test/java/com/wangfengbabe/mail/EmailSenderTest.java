package com.wangfengbabe.mail;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailSenderTest {

    @Autowired
    private EmailSender emailSender;

    @Test
    public void testSendMail() {
        String sender = "wangfengbabe@163.com";
        String receiver = "645917797@qq.com";
        String subject = "王峰测试发邮件功能";
        String body = "正确";
        String send = emailSender.send(sender, receiver, subject, body);
        System.out.println(send);
    }


}