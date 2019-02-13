package com.example.demo.demo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class DemoFunction {
    public static void main(String[] args) {
        Consumer<StringBuffer> consumer = s -> s.append("222");
        List<StringBuffer> list = new ArrayList<>();
        list.add(new StringBuffer("aaa"));
        list.add(new StringBuffer("aaa"));
        list.add(new StringBuffer("aaa"));
        list.add(new StringBuffer("aaa"));
        list.add(new StringBuffer("aaa"));
        list.forEach(consumer);
        System.out.println(list);
    }
}
