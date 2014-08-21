package com.miles.stock.api;

/**
 * @author miles
 * @datetime 2014/5/27 15:47
 */
public interface AmountOperateService {
    /**
     * 操作
     *
     * @param userId 用户id
     * @param amount 资金（正负）
     */
    void operate(String userId, float amount);
}
