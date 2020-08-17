package com.sms.middle.sms.controller;

import com.sms.middle.sms.model.request.RequestSendMessage;
import com.sms.middle.sms.service.YmConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author xuyuanfeng
 */
@Controller
@RestController
@RequestMapping("/mail")
@Slf4j
public class SmsController {
    @Autowired
    private YmConfigService ymConfigService;
    @Autowired
    private JavaMailSenderImpl javaMailSender;

    @PostMapping("/send")
    public String sendMail(@RequestBody @Validated RequestSendMessage requestSendMessage) {
        //TODO 安全校验
        SimpleMailMessage message = new SimpleMailMessage();
        formEntity(requestSendMessage, message);
        try {
            log.info("邮件发送中....");
            javaMailSender.send(message);
        } catch (Exception exception) {
            log.error("邮件发送失败" + exception.getMessage());
            exception.printStackTrace();
            return "邮件发送失败" + exception.getMessage();
        }
        log.info("邮件发送很成功..");
        return "简单邮件发送成功!";
    }

    /**
     * 邮件设置
     */
    private void formEntity(RequestSendMessage requestSendMessage, SimpleMailMessage message) {
        BeanUtils.copyProperties(requestSendMessage, message);
        List<String> sendTos = new ArrayList<>();
        String[] strArray = new String[sendTos.size()];
        requestSendMessage.getSendTo().stream().forEach(sendTos::add);
        message.setTo(sendTos.toArray(strArray));
        message.setFrom(requestSendMessage.getSendFrom());
        message.setSentDate(new Date());
    }
}
