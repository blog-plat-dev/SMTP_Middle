package com.sms.middle.sms.controller;

import com.sms.middle.sms.service.YmConfigService;
import com.sms.middle.sms.utils.ResponseJsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuyuanfeng
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private YmConfigService ymConfigService;

    @RequestMapping("/test")
    public String test() {
        return "this is sms middle platform !";
    }

    @RequestMapping("/config")
    public ResponseJsonResult config() {
        return ResponseJsonResult.ok(ymConfigService.queryAll());
    }
}
