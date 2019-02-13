package com.example.demo.annotation.conditional.onproperty;

import lombok.Data;
import org.springframework.util.StringUtils;

@Data
public class ConditionalOnpropertyBean implements PropertyPersion{

    private String name;
    @Override
    public void speak() {
        if (StringUtils.isEmpty(name)){
            System.out.println("没有输出名称");
        }
        else {
        System.out.println("my name is" + name);
    }
    }
}
