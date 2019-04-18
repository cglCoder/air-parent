package com.aopioc.service;

import com.aopioc.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "air-space-service")
public interface IndexService {

    @PostMapping(value="/service/findUser")
    User findUser();

}
