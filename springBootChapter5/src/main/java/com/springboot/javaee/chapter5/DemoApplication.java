package com.springboot.javaee.chapter5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/8/26下午10:52
 */
@RestController
@SpringBootApplication
public class DemoApplication {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
