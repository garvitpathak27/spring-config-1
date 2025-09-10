package com.example.spring_cloud_config_client.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
@Slf4j
public class ConfigController {

    @Value("${service.name}")
    private String serviceInfo;

    @GetMapping
    public String getServiceInfo(){
        log.info("Service name {}" , serviceInfo);
        return "Service Name: " + serviceInfo;
    }

}
