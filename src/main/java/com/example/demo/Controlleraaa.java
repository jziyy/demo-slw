package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/aaa")
public class Controlleraaa {
//
//    @Autowired
//    InserService service;

    @RequestMapping(value = "/bbb")
    public String aaa(@RequestParam(value = "ccc")String ccc){
        String b = ccc.toUpperCase();
        return b;
    }



}
