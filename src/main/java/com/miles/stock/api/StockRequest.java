package com.miles.stock.api;

/**
 * 股票请求接口
 *
 * @author miles
 * @datetime 2014/5/27 11:30
 */
public interface StockRequest {
    /**
     * @param codes 股票编号
     * @return 股票信息
     */
    String get(String... codes);
}
