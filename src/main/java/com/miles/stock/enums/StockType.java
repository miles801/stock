package com.miles.stock.enums;

import org.apache.commons.lang.StringUtils;

/**
 * 0 深圳
 * 002 中小板 深圳
 * 6    上海
 * 3    创业板 深圳
 *
 * @author miles
 * @datetime 2014/5/27 11:36
 */
public enum StockType {
    SH_A("沪市A股"),
    SH_B("沪市B股"),
    SH_NEW("沪市新股申购"),
    SZ_NEW("深市新股申购"),
    SH_PG("沪市配股"),
    SZ_PG("深市配股"),
    ZXB("中小板"),
    CYB("创业板"),
    SZ_A("深市A股"),
    GZXH("国债现货"),
    SZ_B("深市B股");
    private String value;

    public String getValue() {
        return value;
    }

    StockType(String value) {
        this.value = value;
    }

    public static StockType getType(String code) {
        if (StringUtils.isBlank(code)) {
            throw new IllegalArgumentException("没有获得股票代码!");
        }
        if (!code.matches("\\d{6}")) {
            throw new IllegalArgumentException("不合法的股票代码[" + code + "],股票代码的长度为6位数字!");
        }
        String prefix = code.substring(0, 3);
        if (prefix.equals("600") || prefix.equals("601") || prefix.equals("603")) {
            return SH_A;
        }
        if (prefix.equals("900")) {
            return SH_B;
        }
        if ("000".equals(prefix)) {
            return SZ_A;
        }
        if ("001".equals(prefix)) {
            return GZXH;
        }
        if ("200".equals(prefix)) {
            return SZ_B;
        }
        if ("730".equals(prefix)) {
            return SH_NEW;
        }
        if ("003".equals(prefix)) {
            return SZ_NEW;
        }
        if ("002".equals(prefix)) {
            return ZXB;
        }
        if ("300".equals(prefix)) {
            return CYB;
        }
        if ("700".equals(prefix)) {
            return SH_PG;
        }
        if ("080".equals(prefix)) {
            return SZ_PG;
        }
        throw new IllegalArgumentException("未能识别的股票编号[" + code + "]!");
    }
}
