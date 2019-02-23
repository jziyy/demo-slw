package com.example.demo.web_crawler.httpclient;

import com.example.demo.annotation.bean.UserBean;

import java.lang.reflect.Field;

public class HttpClient_Main {
    public static void main(String[] args) throws NoSuchFieldException {
       // System.out.println(HttpClient_Util.getPageContent("https://blog.csdn.net/cslucifer/article/details/80953400"));
        Field field = UserBean.class.getField("toString");
        System.out.println(field);
    }
}
