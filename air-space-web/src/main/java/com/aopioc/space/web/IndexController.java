package com.aopioc.space.web;


import com.aopioc.pojo.User;
import com.aopioc.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IndexService indexService;

   /* @Autowired
    private RedisFeignClient redisFeignClient;*/


    @RequestMapping(value = "/findUser")
    public User findSpaceNoQuery(){
       /* Map<String,Object> map = new HashMap<>();
        User user = new User("这是你敢",12);
        User user2 = new User("这是你敢2222",12);
        map.put("n1",user);
        map.put("n2",user2);
        redisFeignClient.saveRedisData(map);*/
        User user = indexService.findUser();
        return user;
    }


}
