package com.study.Dao;

/**
 * Created by acer on 2018/8/4.
 */
public class UserDao {
    public void save(){
        System.out.println("UserDao-------");

    }
    public void init(){
        System.out.println("init-------");
    }
    public void destory(){
        System.out.println("destory-------");
    }
    public Integer save1() {
        System.out.println("userDao save...");
        if(1==1) {
            throw new RuntimeException("出大事了....");
        }
        return 10000;
    }
    public Integer save2() {
        System.out.println("user add....");
        return 100;
    }
}
