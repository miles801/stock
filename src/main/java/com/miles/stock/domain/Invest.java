package com.miles.stock.domain;

/**
 * 投资
 *
 * @author miles
 * @datetime 2014/5/27 15:42
 */
public class Invest {
    private String id;
    private User user;
    private String stockCode;
    private Float price;
    /**
     * 数量
     */
    private Integer quantity;
    /**
     * 成本
     */
    private Float cost;

}
