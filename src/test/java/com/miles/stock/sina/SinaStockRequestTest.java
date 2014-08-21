package com.miles.stock.sina;


import com.google.gson.Gson;
import com.miles.stock.api.StockRequest;
import com.miles.stock.core.Configuration;
import com.miles.stock.core.StockEngine;
import com.miles.stock.domain.Stock;
import com.miles.stock.utils.StockUtils;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class SinaStockRequestTest {

    @Before
    public void setUp() throws Exception {
        Configuration configuration = Configuration.getInstance();
        configuration.setStockRequest(new SinaStockRequest());
        configuration.setStockAdapter(new SinaStockAdapter());
    }

    @Test
    public void testGet() throws Exception {
        StockEngine engine = StockEngine.getInstance();
        StockRequest request = engine.getStockRequest();
        while (true) {
            //"600198", "600778",
            String info = request.get("603000");
            Assert.assertNotNull(info);
            String stocks[] = info.split(";");
            List<Stock> stockList = StockUtils.wrapToStock(stocks);
            Gson gson = new Gson();
            System.out.println(gson.toJson(stockList));
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.HOUR_OF_DAY, 11);
            calendar.set(Calendar.MINUTE, 30);
            long start = calendar.getTimeInMillis();
            calendar.set(Calendar.HOUR_OF_DAY, 13);
            calendar.set(Calendar.MINUTE, 0);
            long middle = calendar.getTimeInMillis();
            calendar.set(Calendar.HOUR_OF_DAY, 15);
            long end = calendar.getTimeInMillis();
            long now = new Date().getTime();
            if ((now > start && now < middle) || now > end) {
                break;
            }
            Thread.sleep(1000 * 20);
        }
    }
}