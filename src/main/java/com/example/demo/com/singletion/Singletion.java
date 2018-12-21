package com.example.demo.com.singletion;

//单例模式
public class Singletion {
	private static final Singletion singletion = new Singletion();
	private Singletion() {};
	public static Singletion getSingletion() {
		return singletion;
	}
	public  void  doSomething() {
		System.out.println("do something");
	}
	
}
