package com.aopioc.ancillary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author:JefferyChang
 * @Date:2019/4/16 15:06
 * @Desp:
 */
@RequestMapping("/redis")
@RestController
public  class RedisController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @PostMapping("/saveRedisData")
    public void saveRedisData(@RequestBody  Map<String, Object> map) {
        Set<Map.Entry<String, Object>> entries =
                map.entrySet();
        Iterator<Map.Entry<String, Object>> iterator =
                entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Object> entry = iterator.next();
            Object obj = entry.getValue();
            redisTemplate.opsForValue().set(String.valueOf(entry.getKey()),String.valueOf(obj));
        }

    }
}
