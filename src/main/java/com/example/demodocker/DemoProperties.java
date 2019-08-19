package com.example.demodocker;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;


@ConfigurationProperties("service.error")
@Configuration
@Data
public class DemoProperties {

    public   String DEMO1="DEMO1";

}