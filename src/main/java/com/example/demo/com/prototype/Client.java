package com.example.demo.com.prototype;

public class Client {
	public static void main(String[] args) {
		Prototype prototype = new Prototype("0");
		for (int i = 0; i < 10; i++) {
			String str ="";
			str += i;
			try {
				Prototype prototype1 =	(Prototype) prototype.clone();
				prototype1.setStr1(str);
				prototype1.speak();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
