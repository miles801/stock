package com.miles.stock.utils;

import org.apache.commons.lang.StringUtils;

/**
 * @author miles
 * @datetime 2014/5/27 12:22
 */
public class StockCodeUtils {

    public static String getWrappedCode(String code) {
        if (StringUtils.isBlank(code)) {
            throw new IllegalArgumentException("根据股票代码获得对应的编码时,没有获得股票代码!");
        }
        if (!code.matches("\\d{6}")) {
            throw new IllegalArgumentException("不合法的股票代码,股票代码的长度为6位数字!");
        }
        String prefix = code.substring(0, 1);
        String sh = "6|7|9"; // 上证
        String sz = "0|3"; // 深证
        if (sh.contains(prefix)) {
            return "sh" + code;
        } else if (sz.contains(prefix)) {
            return "sz" + code;
        } else {
            throw new IllegalArgumentException("不支持的股票代码[" + code + "]");
        }
    }
}
