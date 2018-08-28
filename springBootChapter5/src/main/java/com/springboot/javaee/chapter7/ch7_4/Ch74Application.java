package com.springboot.javaee.chapter7.ch7_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/27
 */
@RestController
@SpringBootApplication
public class Ch74Application {
    public static void main(String[] args) {
        SpringApplication.run(Ch74Application.class, args);
    }

//    @Bean
//    public EmbeddedServletContainerFactory servletContainer(){
//        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
//    }
}
