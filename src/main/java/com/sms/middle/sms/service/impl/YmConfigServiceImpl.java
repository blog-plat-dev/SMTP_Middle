package com.sms.middle.sms.service.impl;

import com.sms.middle.sms.mapper.YmConfigMapper;
import com.sms.middle.sms.model.YmConfig;
import com.sms.middle.sms.service.YmConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuyuanfeng
 */
@Service
public class YmConfigServiceImpl implements YmConfigService {
    @Autowired
    private YmConfigMapper mapper;

    @Override
    public List<YmConfig> queryAll() {
        return mapper.selectList(null);
    }
}
