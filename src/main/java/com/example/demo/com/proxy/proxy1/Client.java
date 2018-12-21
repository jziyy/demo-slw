package com.example.demo.com.proxy.proxy1;
/**
 *   客户端
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		Model user = new User("Forever");
		Model proxy = new Proxy(user);
		proxy.login("aaa", "aaa");
		proxy.doString();
		
	}
}
