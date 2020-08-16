package com.sms.middle.sms.model;

import lombok.Data;

import java.util.List;

/**
 * @author xuyuanfeng
 */
@Data
public class SendMessage {
    private String subject;
    private String text;
    private List<String> sendTo;
    private String sendFrom;
}
