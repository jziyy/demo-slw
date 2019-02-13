package com.example.demo.annotation.conditional;

import lombok.Data;
import org.springframework.util.StringUtils;

@Data
public class ConditionalBean implements ConditionalPerson{

    private String name;

    @Override
    public void speek() {
        if (StringUtils.isEmpty(name)){
            System.out.println("今天下雪了");
        }
        else {
            System.out.println(name);
        }
    }
}
