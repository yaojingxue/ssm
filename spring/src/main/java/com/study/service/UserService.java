package com.study.service;

import com.study.Dao.UserDao;

/**
 * Created by acer on 2018/8/4.
 */
public class UserService {
    private UserDao userDao;
    //set 注入

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    //构造方法注入
//    public UserService (UserDao userDao,String name){
//        this.userDao = userDao;
//        System.out.println("name-------------"+name);
//    }
    public void sayhai(){
        System.out.println("sayhai----------");
        userDao.save2();
    }
}
