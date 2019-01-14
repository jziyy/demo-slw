package com.example.demo.annotation.bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @org.springframework.context.annotation.Bean
    public UserBean getBean(){
        UserBean bean =new UserBean();
        bean.setName("aa");
        bean.setPassword("jziyy");
        return bean;
    }
}
