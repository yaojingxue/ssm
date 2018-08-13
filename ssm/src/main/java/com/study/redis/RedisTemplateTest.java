package com.study.redis;

import com.study.pojo.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by acer on 2018/8/13.
 */
@Named
public class RedisTemplateTest {
    @Inject
    private RedisTemplate<String,Object> redisTemplate;
    private Logger logger= LoggerFactory.getLogger(RedisTemplateTest.class);
    public void saveRedis(Book book){
        logger.debug("进入redis----------------");
        redisTemplate.opsForValue().set("book:author",book.getAuthor());
        redisTemplate.opsForValue().set("book:title",book.getTitle());



    }

}
