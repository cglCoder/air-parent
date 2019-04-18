package com.aopioc.service.test;

import com.aopioc.pojo.Order;
import com.aopioc.service.jpaRepository.OrderRepository;
import com.dangdang.ddframe.rdb.sharding.id.generator.IdGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 项目名称 : air-parent
 * 包名 : com.aopioc.service.test
 * 功能介绍 : TODO
 *
 * @author : JefferyChang
 * 日期 : 2019/4/17 21:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTest {

    @Autowired
    private OrderRepository orderRepository;
    @Resource
    private IdGenerator idGenerator;

    @Test
    public void  test1(){
        //System.out.println("111");
       /* for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setUserId((long) i);
            order.setOrderId((long) i);
            orderRepository.save(order);
        }

        for (int i = 10; i < 20; i++) {
            Order order = new Order();
            order.setUserId((long) i + 1);
            order.setOrderId((long) i);
            orderRepository.save(order);
        }*/
       for(int i =0 ;i<100;i++){
           Order order = new Order();
           order.setUserId(Long.valueOf((long)i));
           order.setOrderId(idGenerator.generateId().longValue());
           orderRepository.save(order);
       }

        for(int i =1 ;i<100;i++){
            Order order = new Order();
            order.setUserId(Long.valueOf((long)i));
            order.setOrderId(idGenerator.generateId().longValue());
            orderRepository.save(order);
        }

    }

    @Test
    public void queryOrders(){
        List<Order> orders = orderRepository.findAll();
        System.out.println(orders.size());
        orders.forEach(order -> System.out.println(order));
    }


}
