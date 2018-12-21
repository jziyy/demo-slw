package com.example.demo.com.singletion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//单例模式的扩展对象创建2个
public class Singletionpro {
	private String name;
	private final static int max = 2;
	private static List<Singletionpro> list = new ArrayList<Singletionpro>();
	private Singletionpro(String name) {
		this.name = name;
	}
	static {
		for (int i = 0; i < max; i++) {
			Singletionpro single = new Singletionpro("����"+i);
			list.add(single);
		}
	}
	@SuppressWarnings("unused")
	private static Singletionpro getSingle() {
		
		return list.get(new Random().nextInt(max));
	}
	public void doSomething() {
		System.out.println(name);
	}

}
