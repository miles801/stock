package com.miles.stock.core;

import com.miles.stock.api.StockRequest;
import com.miles.stock.domain.Stock;
import com.miles.stock.sina.SinaStockAdapter;
import com.miles.stock.sina.SinaStockRequest;
import com.miles.stock.utils.StockUtils;

import java.util.List;

/**
 * Created on 2014/7/30 9:51
 *
 * @author miles
 */
public class StockProvider {
    private static StockProvider provider = new StockProvider();

    private StockProvider() {
        Configuration configuration = Configuration.getInstance();
        configuration.setStockRequest(new SinaStockRequest());
        configuration.setStockAdapter(new SinaStockAdapter());
    }

    public static StockProvider getInstance() {
        return provider;
    }

    /**
     * 查询一组股票的信息
     *
     * @param stocks 股票代码
     */
    public List<Stock> queryStocks(String[] stocks) {
        StockEngine engine = StockEngine.getInstance();
        StockRequest request = engine.getStockRequest();
        String info = request.get(stocks);
        return StockUtils.wrapToStock(info.split(";"));
    }
}
