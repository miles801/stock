package com.miles.stock.sina;

import com.miles.stock.api.StockAdapter;
import com.miles.stock.domain.Stock;
import org.apache.commons.lang.StringUtils;

import java.util.Calendar;
import java.util.Date;

/**
 * @author miles
 * @datetime 2014/5/27 11:13
 */
public class SinaStockAdapter implements StockAdapter {
    @Override
    public Stock convert(String stockInfo) {
        if (StringUtils.isBlank(stockInfo)) {
            throw new IllegalArgumentException("将股票信息转成股票对象时,没有获得股票描述信息!");
        }
        Stock stock = new Stock();
        int index = stockInfo.indexOf("=");
        String code = stockInfo.substring(index - 6, index);
        String content = stockInfo.substring(stockInfo.indexOf("\"") + 1, stockInfo.lastIndexOf("\""));
        String[] info = content.split(",");
        stock.setName(info[0]);
        stock.setCode(code);
        stock.setOpenPrice(Float.parseFloat(info[1]));
        stock.setYesterdayClosePrice(Float.parseFloat(info[2]));

        //设置当前价与涨幅
        stock.setCurrentPrice(Float.parseFloat(info[3]));
        stock.setCurrentPercent((stock.getCurrentPrice() - stock.getYesterdayClosePrice()) * 100 / stock.getYesterdayClosePrice());

        //设置收盘价
        Calendar pm3 = Calendar.getInstance();
        pm3.set(Calendar.HOUR_OF_DAY, 15);
        pm3.set(Calendar.MINUTE, 0);
        pm3.set(Calendar.SECOND, 0);
        if (new Date().after(pm3.getTime())) {
            stock.setClosePrice(stock.getCurrentPrice());
            stock.setTodayPercent((stock.getClosePrice() - stock.getYesterdayClosePrice()) * 100 / stock.getYesterdayClosePrice());
        }
        //设置最高/低价、最大/小涨幅
        stock.setTodayHighPrice(Float.parseFloat(info[4]));
        stock.setTodayHighPercent((stock.getTodayHighPrice() - stock.getYesterdayClosePrice()) * 100 / stock.getYesterdayClosePrice());
        stock.setTodayLowPrice(Float.parseFloat(info[5]));
        stock.setTodayLowPercent((stock.getTodayLowPrice() - stock.getYesterdayClosePrice()) * 100 / stock.getYesterdayClosePrice());
        stock.setBuy1(Float.parseFloat(info[6]));
        stock.setSale1(Float.parseFloat(info[7]));
        stock.setVol(Integer.parseInt(info[8]));
        stock.setVolAmount(Float.parseFloat(info[9]));
        stock.setDate(info[30]);
        stock.setTime(info[31]);
        return stock;
    }
}
