import com.study.pojo.Book;
import com.study.redis.RedisTemplateTest;
import com.study.service.imp.ImpBookService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by acer on 2018/8/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserMapperTestcase  {
    @Inject
    private ImpBookService impBookService;
    @Inject
    private RedisTemplateTest template;
    @Inject
    private RedisTemplate<String,Object> redisTemplate;
    @Test
    public void findAlltest(){
        List<Book> list=impBookService.findAll();
        Assert.assertEquals(list.size(),13);

    }
    @Test
    public void findByIdtest(){
        Book book= impBookService.findById(16);

        Assert.assertEquals(book.getAuthor(),"水果");
    }
    @Test
    public void deletetest(){
        impBookService.deletBook(16);
    }
    @Test
    public void redisTest(){
        Jedis jedis=new Jedis("127.0.0.1");

        System.out.println("redis-------------"+jedis.ping());
    }
    @Test
    public void redisSavetest(){
        Book book= impBookService.findById(10);
        System.out.println("查询出的book"+book.toString());
        template.saveRedis(book);
        String author= (String)redisTemplate.opsForValue().get("book:author");
        String title= (String)redisTemplate.opsForValue().get("book:title");
        System.out.println("--------author----------------"+author);
        System.out.println("--------title----------------"+title);



    }
}
