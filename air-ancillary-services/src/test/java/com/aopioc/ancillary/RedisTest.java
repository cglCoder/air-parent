package com.aopioc.ancillary;

import com.aopioc.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author:JefferyChang
 * @Date:2019/4/16 14:29
 * @Desp:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {


    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void test1(){
       /* redisTemplate.opsForValue().set("zhouyadong","22");
        String obj = redisTemplate.opsForValue().get("aa");
        System.out.println(obj);*/
        User user = new User("张三", 12);
        user.setId(123);
        mongoTemplate.insert(user);
    }




}
