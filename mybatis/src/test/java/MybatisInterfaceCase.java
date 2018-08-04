import com.study.mapper.UserMapper;
import com.study.pojo.User;
import com.study.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by acer on 2018/8/4.
 */
public class MybatisInterfaceCase {
    Logger logger = Logger.getLogger(MybatisInterfaceCase.class);

    @Test
    public void UserMapperinterfacecase() {
        SqlSession sqlSession = MybatisUtil.getSqlsession();
        //动态代理模式生成一个 mapper 类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findById(3);
        logger.info("---" + user + "---");
        sqlSession.close();
    }

    @Test
    public void testSave() {
        SqlSession sqlSession = MybatisUtil.getSqlsession();
        //动态代理模式生成一个 mapper 类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setEamil("9090@163.com");
        user.setPassword("89765");
        user.setUsername("理");
        mapper.save(user);
        sqlSession.commit();
        logger.info(user.getId());
        sqlSession.close();
    }

    @Test
    public void testfindAll() {
        SqlSession sqlSession = MybatisUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> useLiset = mapper.findAll();
        for (User user : useLiset
                ) {
            logger.info(user);
        }

    }

    @Test
    public void testfindMap() {
        SqlSession sqlSession = MybatisUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("username", "小王");
        param.put("password", "12312");
        User user = mapper.findMap(param);
        logger.info(user);

    }

    @Test
    public void testfindParams() {
        SqlSession sqlSession = MybatisUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findParams("小王", "123123");
        logger.info(user);

    }

    @Test
    public void testfindMap1() {
        SqlSession sqlSession = MybatisUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("username", null);
        param.put("password", "123");
        List<User> useLiset = mapper.findMap1(param);
        for (User user : useLiset
                ) {
            logger.info(user);
        }
    }

    @Test
    public void testsave1() {
        SqlSession sqlSession = MybatisUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userlist = new ArrayList<User>();
        User user = new User();
        user.setEamil("9190@163.com");
        user.setPassword("89764");
        user.setUsername("动态代");
        userlist.add(user);
        User user1 = new User();
        user1.setEamil("9290@163.com");
        user1.setPassword("89763");
        user1.setUsername("动代理");
        userlist.add(user1);
        User user2 = new User();
        user2.setEamil("9390@163.com");
        user2.setPassword("89762");
        user2.setUsername("动理");
        userlist.add(user2);
        logger.info(userlist.toString());

        mapper.save1(userlist);
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testfindByIds() {
        SqlSession sqlSession = MybatisUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Integer> list =new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        List<User> listuser= mapper.findByIds(list);
        for (User user:listuser
             ) {
            logger.info(user);
        }



    }

}


