package com.example.demo.annotation.bean;

import org.springframework.beans.factory.annotation.Value;

public class UserBean {
    @Value("${user.bean.name}")
    private String name;
    @Value("${user.bean.password}")
    private String password;
    @Value("${user.bean.state}")
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
