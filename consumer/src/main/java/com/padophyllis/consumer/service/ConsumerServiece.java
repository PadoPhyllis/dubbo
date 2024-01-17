package com.padophyllis.consumer.service;

import com.padophyllis.client.ProducerService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiece {

    @DubboReference(version = "1.0")
    private ProducerService producerService;

    public String sendService(){
        return producerService.backService();
    }
}
