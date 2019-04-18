package com.aopioc.service.controller;

import com.aopioc.pojo.User;
import com.aopioc.service.facade.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private IndexService indexService;

    @PostMapping(value = "/service/findUser")
    public User queryAdvertByQuery(){
        return indexService.findOne();
    }


}
