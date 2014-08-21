package com.miles.stock.api;

import com.miles.stock.domain.Stock;

/**
 * 股票适配器
 *
 * @author miles
 * @datetime 2014/5/27 11:11
 */
public interface StockAdapter {
    /**
     * 将股票信息转换成股票对象
     *
     * @param stockInfo 股票信息
     * @return 股票对象
     */
    Stock convert(String stockInfo);
}
