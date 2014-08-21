package com.miles.stock.core;

import com.miles.stock.api.StockAdapter;
import com.miles.stock.api.StockRequest;

/**
 * 股票平台的引擎，用于获得各种服务
 * Created by miles on 2014/5/27.
 */
public class StockEngine {
    private static StockEngine stockEngine = new StockEngine();
    private Configuration configuration = null;

    public static StockEngine getInstance() {
        return stockEngine;
    }

    private StockEngine() {
        configuration = Configuration.getInstance();
    }

    public StockAdapter getStockAdapter() {
        return configuration.getStockAdapter();
    }

    public StockRequest getStockRequest() {
        return configuration.getStockRequest();
    }


}
