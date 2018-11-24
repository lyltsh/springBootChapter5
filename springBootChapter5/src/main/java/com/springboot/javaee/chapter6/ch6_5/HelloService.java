package com.springboot.javaee.chapter6.ch6_5;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/11/2411:03 PM
 */
public class HelloService {
    private String msg;

    public void sayHello() {
        System.out.println("SayHello: " + msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
