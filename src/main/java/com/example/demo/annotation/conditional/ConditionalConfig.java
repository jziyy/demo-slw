package com.example.demo.annotation.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalConfig {

    @Bean
    @Conditional(NameConditional.class)
    public ConditionalBean getConditionalBean(){
        ConditionalBean bean =new ConditionalBean();
        bean.setName("aaaaaaaa");
        return bean;
    }

    @Bean
    @Conditional(NameConditional1.class)
    public ConditionalBean getConditionalBean1(){
        ConditionalBean bean =new ConditionalBean();
        bean.setName("saassasas");
        return bean;
    }


}
