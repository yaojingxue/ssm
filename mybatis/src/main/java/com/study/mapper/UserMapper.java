package com.study.mapper;

import com.study.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by acer on 2018/8/4.
 */
public interface UserMapper {
     User findById(Integer id);
    void save(User user);
    void save1(List<User> user);
    List<User>  findAll();
    User findMap (Map<String,Object> map);

    List<User>  findMap1 (Map<String,Object> map);

    //注解@Param 起别名
    User findParams (@Param("username") String username,@Param("password") String password);
    List<User> findByIds (List<Integer> list);


}
