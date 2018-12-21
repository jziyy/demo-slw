package com.example.demo.com.proxy.proxy2;

public class User implements Model{

	private String name = "";
	public User(Model model,String _name) throws Exception {
		if (model == null) {
			throw new Exception("不能创建真实角色!!");
		}
		else {
			this.name = _name;
		}
	}
	public void login(String userName, String password) {
		System.out.println("登录名" +userName + "的" + this.name + "登陆成功");
	}

	public void doString() {
		System.out.println("do do do");
	}

}
