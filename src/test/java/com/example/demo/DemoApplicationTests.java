package com.example.demo;

import com.example.demo.annotation.config.qualifier.bean.Qualifier_UserBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    Qualifier_UserBean bean;
    @Autowired
    Qualifier_UserBean bean1;
    @Test
    public void contextLoads() {
        bean.setName("aaaa");
        bean.setPassword("aaaa");
        System.out.println(bean);
        System.out.println(bean1);
    }
    @Test
    public void aaa() {
        System.out.println(bean);
        System.out.println(bean1);
    }

}

