package com.aopioc.service.facade.impl;

import com.aopioc.pojo.User;
import com.aopioc.service.facade.IndexService;
import com.aopioc.service.jpaRepository.IndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Transactional
public class IndexServiceImpl implements IndexService{

    @Autowired
    private IndexRepository indexRepository;

    @Override
    public User findOne() {
        List<User> listUser = indexRepository.findAll();
        listUser.forEach(user -> System.out.println(user));
        return listUser.get(0);
    }
}
