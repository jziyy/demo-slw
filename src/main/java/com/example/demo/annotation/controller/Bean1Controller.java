package com.example.demo.annotation.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.annotation.bean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class Bean1Controller {
    @Autowired
    @Qualifier("userbean1")
    UserBean bean;

    @Autowired
    @Qualifier("userbean2")
    UserBean bean1;


    @RequestMapping(value = "/aaaa")
    public String getInfo(@RequestParam(value = "state")String state){
        System.out.println(bean);
        System.out.println(bean1);

        Map<String,Object> map = new HashMap<>();
        map.put("1",bean);
        map.put("2",bean1);

        return JSON.toJSONString(map);
    }

}
