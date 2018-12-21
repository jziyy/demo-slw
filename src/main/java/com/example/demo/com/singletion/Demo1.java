package com.example.demo.com.singletion;

public class Demo1 {
	private static final Demo1  demo = new Demo1();
	private Demo1 () {}
	public static Demo1 getDemo() {
		return demo;
	}
	
}
