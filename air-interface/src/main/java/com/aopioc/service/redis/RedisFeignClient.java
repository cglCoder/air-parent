package com.aopioc.service.redis;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * 项目名称 : air-parent
 * 包名 : com.aopioc.service.redis
 * 功能介绍 : TODO
 *
 * @author : JefferyChang
 * 日期 : 2019/4/16 22:43
 */
@FeignClient(name = "air-ancillary-services")
public interface RedisFeignClient {

    @PostMapping("/redis/saveRedisData")
    void saveRedisData(@RequestBody Map<String,Object> map);



}
