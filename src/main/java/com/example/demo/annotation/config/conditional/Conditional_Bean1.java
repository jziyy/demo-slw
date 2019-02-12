package com.example.demo.annotation.config.conditional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
//引入@value注解所要调用的配置文件地址
@PropertySource(value = "classpath:conditional/application_conditional.properties")
public class Conditional_Bean1 {
    @Value("${conditional.cn.name}")
    private String name;
    @Value("${conditional.cn.sex}")
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
