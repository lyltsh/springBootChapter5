package com.springboot.javaee.chapter7.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/28
 */
@RestController
public class WsController {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg) {
        if ("wfy".equals(principal.getName())) {
            messagingTemplate.convertAndSendToUser("wisely",
                    "/queue/notifications",
                    principal.getName() + "-send:" + msg);
        } else {
            messagingTemplate.convertAndSendToUser("wfy",
                    "/queue/notifications",
                    principal.getName() + "-send:" + msg);
        }
    }
}
