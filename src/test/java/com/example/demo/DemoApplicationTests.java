package com.example.demo;

import com.example.demo.annotation.bean.UserBean;
import com.example.demo.annotation.conditional.ConditionalBean;
import com.example.demo.annotation.conditional.onproperty.PropertyPersion;
import com.example.demo.annotation.configurationproperties.ConfigurationPropertiesBean;
import com.example.demo.annotation.value.Value_bean;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
public class DemoApplicationTests {

    @Before
    public void before(){
        System.out.println("----------------------before");
    }
    @After
    public void after(){
        System.out.println("-----------------------after");
    }


}

