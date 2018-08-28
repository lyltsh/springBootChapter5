package com.springboot.javaee.chapter7.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/27
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
    对/和/login路径不拦截
    登录页面login
    成功跳转chat
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/","/login").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/chat")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    /**
    使用了两个用户
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("wyf").password("wfy").roles("USER")
                .and()
                .withUser("wisely").password("wisely").roles("USER");
    }

    /**
     * 对于/resources/static/** 路径下不拦截
     * @param webSecurity
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity webSecurity) throws Exception{
        webSecurity.ignoring().antMatchers("/resources/static/**");
    }
}
