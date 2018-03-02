package com.livtrip.web.controller;

import com.livtrip.web.model.Email;
import com.livtrip.web.service.IMailService;
import org.apache.commons.collections.map.HashedMap;
import org.apache.velocity.app.VelocityEngine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.velocity.VelocityEngineUtils;

import javax.mail.internet.MimeMessage;
import java.util.Map;

/**
 * Created by xierongli on 17/6/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestEmail {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private VelocityEngine velocityEngine;

    @Autowired
    private IMailService mailService;

    @Test
    public void sendSimpleMail() throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("no-replay@tourongjia.com");
        message.setTo("545739504@qq.com");
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");
        mailSender.send(message);
    }

    @Test
    public void sendTemplateMail() throws Exception {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom("livtrip@163.com");
        helper.setTo("545739504@qq.com");
        helper.setSubject("主题：模板邮件");
        Map<String, Object> model = new HashedMap();
        model.put("username", "didi");
        String text = VelocityEngineUtils.mergeTemplateIntoString(
                velocityEngine, "mail/test.vm", "UTF-8", model);
        helper.setText(text, true);
        mailSender.send(mimeMessage);
    }

    @Test
    public void testSendFreemarkerMail() throws Exception {
        Email mail = new Email();
        mail.setEmail("545739504@qq.com");
        mail.setSubject("你个小逗比");
        mail.setContent("科帮网欢迎您");
        mail.setTemplate("mail/welcome");
        mailService.sendFreemarker(mail);
    }

    @Test
    public void testSend() throws Exception {
        Email email = new Email();
        email.setEmail("545739504@qq.com");
        email.setSubject("你个小逗ewwe比");
        email.setContent("科帮网欢迎您");
        mailService.send(email);

    }





}
