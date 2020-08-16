package com.sms.middle.sms.model.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author xuyuanfeng
 */
@Data
public class RequestSendMessage {
    /**
     * 用于安全校验
     */
    @NotEmpty(message = "应用Id不可为空")
    private String appId;
    @NotEmpty(message = "md5SecretKey不可为空")
    private String md5SecretKey;
    @NotNull(message = "时间戳不可为空")
    private Long time;
    @NotEmpty(message = "发送主题不可为空")
    private String subject;
    @NotEmpty(message = "发送内容不可为空")
    private String text;
    @Size(min = 1, message = "至少发送一个")
    private List<String> sendTo;
    @NotEmpty(message = "发送人不可为空")
    private String sendFrom;
}
