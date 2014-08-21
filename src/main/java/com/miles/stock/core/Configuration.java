package com.miles.stock.core;

import com.miles.stock.api.StockAdapter;
import com.miles.stock.api.StockRequest;

/**
 * 股票平台的服务配置项
 * Created by miles on 2014/5/27.
 */
public class Configuration {
    private static Configuration ourInstance = new Configuration();

    public static Configuration getInstance() {
        return ourInstance;
    }

    private Configuration() {
    }

    private StockAdapter stockAdapter;
    private StockRequest stockRequest;

    public StockAdapter getStockAdapter() {
        return stockAdapter;
    }

    public void setStockAdapter(StockAdapter stockAdapter) {
        this.stockAdapter = stockAdapter;
    }

    public StockRequest getStockRequest() {
        return stockRequest;
    }

    public void setStockRequest(StockRequest stockRequest) {
        this.stockRequest = stockRequest;
    }
}
