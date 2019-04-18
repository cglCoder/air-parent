package com.aopioc.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 项目名称 : air-parent
 * 包名 : com.aopioc.pojo
 * 功能介绍 : TODO
 *
 * @author : JefferyChang
 * 日期 : 2019/4/17 21:54
 */
@Entity
@Table(name = "t_order")
@Data
public class Order implements Serializable {
    @Id
    private Long orderId;

    private Long userId;



}
