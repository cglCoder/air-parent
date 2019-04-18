package com.aopioc.service.jpaRepository;

import com.aopioc.pojo.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 项目名称 : air-parent
 * 包名 : com.aopioc.service.jpaRepository
 * 功能介绍 : TODO
 *
 * @author : JefferyChang
 * 日期 : 2019/4/17 21:57
 */
@Repository
public interface OrderRepository  extends JpaRepository<Order,Long> {

}
