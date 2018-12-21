package com.example.demo.com.prototype;

public class Prototype implements Cloneable{
	private String str;
	private String str1;
	public Prototype(String str) {
		this.str = str;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Prototype prototype = null;
		prototype = (Prototype) super.clone();
		return prototype;
	}
	public void speak() {
		System.out.println(str);
		System.out.println(str1);
	}
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
}
