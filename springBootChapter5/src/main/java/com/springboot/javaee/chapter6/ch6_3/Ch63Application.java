package com.springboot.javaee.chapter6.ch6_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/27
 */
@RestController
@SpringBootApplication
public class Ch63Application {
    @Autowired
    private AuthorSettings authorSettings;

    public static void main(String[] args){
        SpringApplication.run(Ch63Application.class, args);
    }

    @RequestMapping("/author")
    public String author(){
        return "author, name:" + authorSettings.getName() + ", author: " + authorSettings.getAuthor();
    }
}
