package com.example.demo;

import com.example.demo.annotation.bean.UserBean;
import com.example.demo.annotation.conditional.ConditionalBean;
import com.example.demo.annotation.conditional.onproperty.PropertyPersion;
import com.example.demo.annotation.configurationproperties.ConfigurationPropertiesBean;
import com.example.demo.annotation.value.Value_bean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Annotation extends DemoApplicationTests {
    @Autowired
    @Qualifier("userbean1")
    UserBean bean;

    @Autowired
    @Qualifier("userbean2")
    UserBean bean2;

    @Autowired
    @Qualifier("userbean1")
    UserBean bean1;

    @Autowired
    ConfigurationPropertiesBean configurationPropertiesBean;

    @Autowired
    ConditionalBean conditionalBean;

    @Autowired
    PropertyPersion conditionalOnpropertyBean;

    @Autowired
    Value_bean value_bean;

    @Test
    public void value(){
        System.out.println(value_bean);
    }

    @Test
    public void conditionalOnpropertyBean(){
        conditionalOnpropertyBean.speak();
    }


    @Test
    public void conditional (){
        conditionalBean.speek();
    }
    @Test
    public void configurationProperties(){
        System.out.println(configurationPropertiesBean);
    }
    @Test
    public void test(){
        System.out.println("aaaa");
        //lambok @Bean注解提供了重写equals功能
        System.out.println("--------equals");
        System.out.println(bean);
        System.out.println(bean1.equals(bean));
        //hashcode
        System.out.println("--------hashcode");
        System.out.println(bean1.hashCode());
        System.out.println(bean);
        System.out.println(bean.hashCode());
        System.out.println(bean2);
        System.out.println(bean2.hashCode());


    }

}
