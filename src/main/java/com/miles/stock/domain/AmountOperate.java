package com.miles.stock.domain;

import java.util.Date;

/**
 * 资金操作记录
 *
 * @author miles
 * @datetime 2014/5/27 15:36
 */
public class AmountOperate {
    private String id;
    private User user;
    /**
     * 金额：通过正负来表示投资、撤资
     */
    private Float amount;
    private Date createdTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
