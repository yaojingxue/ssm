import com.study.mapper.UserMapper;
import com.study.pojo.User;
import com.study.utils.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by acer on 2018/8/3.
 */
public class MybatisTestCase {
    private  static Logger logger= Logger.getLogger(MybatisTestCase.class);

    @Test
    public void mybatisLoadxml(){
        try {
            //从classpath中读取加载mybatis.xml配置
            Reader reader= Resources.getResourceAsReader("mybatis.xml");
            //根据SqlSessionFactoryBuilder构建SqlSessionFactory
            SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(reader);
            //由SqlSessionFactory 构建SqlSession对象
            SqlSession sqlSession=sessionFactory.openSession();

            //crud
            User user=sqlSession.selectOne("com.study.mapper.UserMapper.findById",2);
            //User user =new User();
            //user.setUsername("无语");
            //user.setPassword("444");
            //sqlSession.insert("com.study.mapper.UserMapper.save",user);
            logger.info("user对象"+user);

            //释放资源
            sqlSession.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void UserInsertcase(){
        User user=new User();
        user.setPassword("123456789");
        user.setUsername("无-语");
        user.setEamil("5555@qq.com");
        SqlSession sqlSession= MybatisUtil.getSqlsession();
        sqlSession.update("com.study.mapper.UserMapper.save",user);
        logger.info("user对象"+user);
//        sqlSession.commit();
//        sqlSession.close();
    }
    @Test
    public void UserUpdatecase(){
        SqlSession sqlSession= MybatisUtil.getSqlsession();

        User user=sqlSession.selectOne("com.study.mapper.UserMapper.findById",2);
        user.setPassword("update@163.com");
        sqlSession.update("com.study.mapper.UserMapper.change",user);
        logger.info("user对象"+user);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void UserRemovecase(){
        SqlSession sqlSession=MybatisUtil.getSqlsession();
        sqlSession.delete("com.study.mapper.UserMapper.remove",10);
        sqlSession.commit();
        sqlSession.close();
    }


}
