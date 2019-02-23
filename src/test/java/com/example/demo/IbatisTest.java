package com.example.demo;


import com.example.demo.ibatis.Ibatis_Bean;
import com.example.demo.ibatis.Ibatis_Dao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class IbatisTest extends DemoApplicationTests {

    @Autowired
    Ibatis_Dao ibatis_dao;

    @Test
    public void InsertManyBean(){
        List<Ibatis_Bean> ibatis_beanList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Ibatis_Bean ibatis_bean = new Ibatis_Bean();
            ibatis_bean.setName("nameA" + i);
            ibatis_bean.setPassword("passwordA" + i);
            ibatis_beanList.add(ibatis_bean);
            System.out.println(ibatis_beanList);
        }
        System.out.println("-------" + ibatis_beanList);
        ibatis_dao.insertManyBean(ibatis_beanList);
    }



}
