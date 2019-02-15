package com.example.demo.annotation.value;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@PropertySource(value = "classpath:/demo/application.properties")
public class Value_bean {
    @Value("${user.bean.name}")
    private String name;
    @Value("${user.bean.password}")
    private String password;
    @Value("${user.bean.state}")
    private String state;

}
