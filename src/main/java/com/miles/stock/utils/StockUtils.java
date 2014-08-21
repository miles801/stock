package com.miles.stock.utils;

import com.miles.stock.api.StockAdapter;
import com.miles.stock.core.StockEngine;
import com.miles.stock.domain.Stock;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author miles
 * @datetime 2014/5/28 11:38
 */
public class StockUtils {
    /**
     * 将股票信息（通过StockAdapter适配器）转成股票对象集合
     *
     * @param stock 股票信息
     * @return 股票对象结合
     */
    public static List<Stock> wrapToStock(String... stock) {
        List<Stock> stocks = new ArrayList<Stock>();
        if (stock == null || stock.length < 1) {
            return stocks;
        }
        StockEngine engine = StockEngine.getInstance();
        StockAdapter adapter = engine.getStockAdapter();
        for (String bar : stock) {
            if (StringUtils.isBlank(bar)) continue;
            Stock foo = adapter.convert(bar);
            if (foo != null) {
                stocks.add(foo);
            }
        }
        return stocks;
    }
}
