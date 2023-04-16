package com.luo.wiley.springbootdemo.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * t_sale
 * @author 
 */
@Data
public class TSale implements Serializable {
    private Integer id;

    /**
     * 产品id
     */
    private Integer productId;

    /**
     * 客户
     */
    private String consume;

    /**
     * 销售单价
     */
    private Double price;

    /**
     * 销售数量
     */
    private Integer amount;

    private static final long serialVersionUID = 1L;
}