package com.springboot.javaee.chapter6.ch6_2;

import org.springframework.beans.factory.annotation.Value;
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
public class Ch62Application {
    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/book")
    public String book() {
        return "bookAuthor: " + bookAuthor + ",bookName:" + bookName;
    }

    public static void main(String[] args) {
        SpringApplication.run(Ch62Application.class, args);
    }
}
