package com.example.demo.annotation.config.qualifier.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Qualifier_Config {

    @Bean("userbean1")
  //  @Scope(value = "prototype")
    public Qualifier_UserBean getBean(){
        Qualifier_UserBean bean =new Qualifier_UserBean();
        bean.setName("aa");
        bean.setPassword("jziyy");
        return bean;
    }
    @Bean("userbean2")
   // @Scope(value = "prototype")
    public Qualifier_UserBean getBean1(){
        Qualifier_UserBean bean =new Qualifier_UserBean();
        bean.setName("aaaaaaaaaa");
        bean.setPassword("jziyy111111");
        return bean;
    }
}
