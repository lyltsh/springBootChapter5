package com.springboot.javaee.chapter6.ch6_5;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/11/2411:01 PM
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static final String MSG = "Default hello";
    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
