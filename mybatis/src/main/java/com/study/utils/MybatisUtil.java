package com.study.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by acer on 2018/8/3.
 */
public class MybatisUtil {
    private static SqlSessionFactory sessionFactory= BuildSqlSessionFactory();
    private  static SqlSessionFactory BuildSqlSessionFactory() {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            return sessionFactory;
        } catch (IOException e) {
          throw new RuntimeException();
        }
    }
    public static SqlSessionFactory getSessionFactory(){
        return sessionFactory;
    }
    public static SqlSession getSqlsession(){
        return sessionFactory.openSession();
    }

}
