package com.study;

import com.study.Dao.UserDao;
import com.study.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by acer on 2018/8/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class springTestCase {
    //    @Test
//    public void testSave(){
//        //默认情况下spring容器中的类都为单例类 类会在容器启动时候加载  工厂模式
//        ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        UserDao userDao=(UserDao)context.getBean("userDao");
//        userDao.save();
//    }
//    @Test
//    public void testServicesayhi() {
//        //IOC DI 控制反转 和依赖注入  将控制权掌握到自己手里，如下面测试方法 service 需要一个UserDao对象
//        //一般都是 new 一个， 现在是 set注入， 则是 我要用UserDao 对象 Spring 提供给我一个
//        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        UserService userService = (UserService) context.getBean("userService");
//        userService.sayhai();
//    }

    @Autowired
    private UserService userService;

    @Test
    public void testSayHi() {
        userService.sayhai();
    }
}
