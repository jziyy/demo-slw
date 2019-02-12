package com.example.demo.annotation.bean;

import lombok.Data;

//@Configuration 中的@bean先执行后才会执行@value注解的赋值
@Data
public class UserBean {
 ///   @Value("${user.bean.name}")
    private String name;
//    @Value("${user.bean.password}")
    private String password;
 //   @Value("${user.bean.state}")
    private String state;

}
