package com.aopioc.service.jpaRepository;

import com.aopioc.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndexRepository  extends JpaRepository<User,Integer> {


}
