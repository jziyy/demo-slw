package com.example.demo.com.proxy.proxy2;

public class Client {
	public static void main(String[] args) {
		Model proxy = new Proxy("jziyy");
		proxy.login("111", "2222");
		proxy.doString();
	}
}
