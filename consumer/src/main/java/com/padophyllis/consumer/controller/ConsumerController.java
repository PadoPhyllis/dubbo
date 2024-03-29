package com.padophyllis.consumer.controller;

import com.padophyllis.consumer.service.ConsumerServiece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private ConsumerServiece consumerServiece;

    @GetMapping("/send")
    public String Send(){
        return consumerServiece.sendService();
    }
}
