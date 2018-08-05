package com.study.pojo;

import java.io.Serializable;

/**
 * Created by acer on 2018/8/5.
 */
public class User implements Serializable {
    private static final long serialVersionUID = -945577543997292305L;
    private Integer id;
    private String  username;
    private String  password;
    private String  email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return password;
    }

    public void setUserpassword(String userpassword) {
        this.password = userpassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", userpassword='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
