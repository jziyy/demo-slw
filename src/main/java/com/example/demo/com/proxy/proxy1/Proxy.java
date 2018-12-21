package com.example.demo.com.proxy.proxy1;
/**
 *  代理类
 * @author Administrator
 *
 */
public class Proxy implements Model {

	private Model user = null;
//	public Proxy() {
//			user = new Proxy();
//	}
	public Proxy(Model _user) {
		this.user = _user;
	}
	public void login(String uerName, String password) {
		user.login(uerName, password);

	}

	public void doString() {
		this.before();
		user.doString();
		this.after();
	}
	public void before() {
		System.out.println("do something");
	}
	public void after() {
		System.out.println("do others");
	}
}
