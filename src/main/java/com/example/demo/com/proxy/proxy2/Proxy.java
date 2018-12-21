package com.example.demo.com.proxy.proxy2;

public class Proxy implements Model {

	private Model user = null;
	public Proxy(String name) {
		try {
			user = new User(this, name);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void login(String userName, String password) {
		this.user.login(userName, password);
	}

	public void doString() {
		this.user.doString();

	}

}
