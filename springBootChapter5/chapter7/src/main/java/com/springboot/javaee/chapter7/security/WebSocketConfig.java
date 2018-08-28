package com.springboot.javaee.chapter7.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.security.config.annotation.web.socket.AbstractSecurityWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/27
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractSecurityWebSocketMessageBrokerConfigurer {
    /**
     * 注册一个名为endpointChat的endpoint
     * @param registry
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/endpointWisely").withSockJS();
        registry.addEndpoint("/endpointChat").withSockJS();
    }

    /**
     * 点对点式增加一个/queue消息代理
     * @param registry
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/queue", "/topic");
    }
}
