package com.example.demo.com.proxy.proxy1;
/**
 *    被代理类
 * @author Administrator
 *
 */
public class User implements Model{

	private String name = "";
	public User(String _name){
		this.name = _name;
	}
	public void login(String userName, String password) {
		System.out.println("名称 :" + name + "登陆了-------");
		
	}

	
	public void doString() {
		System.out.println("working=========");
	}

}
