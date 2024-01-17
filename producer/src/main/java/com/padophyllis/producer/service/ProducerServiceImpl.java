package com.padophyllis.producer.service;

import com.padophyllis.client.ProducerService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0")
public class ProducerServiceImpl implements ProducerService {
    public String backService(){
        return "dubbo ~ 测试成功！";
    }
}
