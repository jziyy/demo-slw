package com.example.demo.annotation.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean("userbean1")
  //  @Scope(value = "prototype")
    public UserBean getBean(){
        UserBean bean =new UserBean();
        bean.setName("aa");
        bean.setPassword("jziyy");
        return bean;
    }
    @Bean("userbean2")
   // @Scope(value = "prototype")
    public UserBean getBean1(){
        UserBean bean =new UserBean();
        bean.setName("aaaaaaaaaa");
        bean.setPassword("jziyy111111");
        return bean;
    }
}
