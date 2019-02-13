package com.example.demo.annotation.conditional.onproperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Primary
@Configuration
public class ConditionalOnPropertyConfig {
    @Bean
    @Primary
    @ConditionalOnProperty(prefix = "conditionalOnProperty",name = {"value","name","password"})
    public PropertyPersion getConditionalOnPropertyBean(){
        ConditionalOnpropertyBean bean =new ConditionalOnpropertyBean();
        bean.setName("jziyy");
        return bean;
    }

    @Bean
    public PropertyPersion getConditionalOnPropertyBean1(){
        ConditionalOnpropertyBean bean =new ConditionalOnpropertyBean();
        return bean;
    }
}
