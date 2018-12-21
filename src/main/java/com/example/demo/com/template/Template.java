package com.example.demo.com.template;

public abstract class Template {
	public abstract void start();
	public abstract void speak();
	public abstract void stop();
	public final void run () {
		this.start();
		this.speak();
		this.stop();
	}
}
