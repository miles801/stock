package com.miles.stock.domain;

/**
 * @author miles
 * @datetime 2014/5/27 11:03
 */
public class Stock {
    private String id;
    /**
     * 股票名称
     */
    private String name;
    /**
     * 拼音缩写
     */
    private String shortName;
    /**
     * 股票代码
     */
    private String code;
    /**
     * 股票类型：深A、沪A、中小板、创业板....
     */
    private String type;

    /**
     * 股票行业
     */
    private String industry;
    /**
     * 开盘价
     */
    private Float openPrice;
    /**
     * 收盘价
     */
    private Float closePrice;
    /**
     * 当日涨幅
     */
    private Float todayPercent;

    private Float yesterdayClosePrice;
    /**
     * 当前价
     */
    private Float currentPrice;
    private Float currentPercent;

    /**
     * 今日最高价
     */
    private Float todayHighPrice;
    private Float todayHighPercent;

    /**
     * 今日最低价
     */
    private Float todayLowPrice;
    private Float todayLowPercent;

    private Float buy1;
    private Float buy2;
    private Float buy3;
    private Float buy4;
    private Float buy5;
    private Float sale1;
    private Float sale2;
    private Float sale3;
    private Float sale4;
    private Float sale5;
    /**
     * 成交量（股）
     */
    private Integer vol;

    /**
     * 成交金额
     */
    private Float volAmount;

    /**
     * 日期
     */
    private String date;

    /**
     * 时间
     */
    private String time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Float getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(Float openPrice) {
        this.openPrice = openPrice;
    }

    public Float getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(Float closePrice) {
        this.closePrice = closePrice;
    }

    public Float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Float currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Float getTodayHighPrice() {
        return todayHighPrice;
    }

    public void setTodayHighPrice(Float todayHighPrice) {
        this.todayHighPrice = todayHighPrice;
    }

    public Float getTodayLowPrice() {
        return todayLowPrice;
    }

    public void setTodayLowPrice(Float todayLowPrice) {
        this.todayLowPrice = todayLowPrice;
    }

    public Float getBuy1() {
        return buy1;
    }

    public void setBuy1(Float buy1) {
        this.buy1 = buy1;
    }

    public Float getBuy2() {
        return buy2;
    }

    public void setBuy2(Float buy2) {
        this.buy2 = buy2;
    }

    public Float getBuy3() {
        return buy3;
    }

    public void setBuy3(Float buy3) {
        this.buy3 = buy3;
    }

    public Float getBuy4() {
        return buy4;
    }

    public void setBuy4(Float buy4) {
        this.buy4 = buy4;
    }

    public Float getBuy5() {
        return buy5;
    }

    public void setBuy5(Float buy5) {
        this.buy5 = buy5;
    }

    public Float getSale1() {
        return sale1;
    }

    public void setSale1(Float sale1) {
        this.sale1 = sale1;
    }

    public Float getSale2() {
        return sale2;
    }

    public void setSale2(Float sale2) {
        this.sale2 = sale2;
    }

    public Float getSale3() {
        return sale3;
    }

    public void setSale3(Float sale3) {
        this.sale3 = sale3;
    }

    public Float getSale4() {
        return sale4;
    }

    public void setSale4(Float sale4) {
        this.sale4 = sale4;
    }

    public Float getSale5() {
        return sale5;
    }

    public void setSale5(Float sale5) {
        this.sale5 = sale5;
    }

    public Integer getVol() {
        return vol;
    }

    public void setVol(Integer vol) {
        this.vol = vol;
    }

    public Float getVolAmount() {
        return volAmount;
    }

    public void setVolAmount(Float volAmount) {
        this.volAmount = volAmount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Float getYesterdayClosePrice() {
        return yesterdayClosePrice;
    }

    public void setYesterdayClosePrice(Float yesterdayClosePrice) {
        this.yesterdayClosePrice = yesterdayClosePrice;
    }

    public Float getCurrentPercent() {
        return currentPercent;
    }

    public void setCurrentPercent(Float currentPercent) {
        this.currentPercent = currentPercent;
    }

    public Float getTodayHighPercent() {
        return todayHighPercent;
    }

    public void setTodayHighPercent(Float todayHighPercent) {
        this.todayHighPercent = todayHighPercent;
    }

    public Float getTodayLowPercent() {
        return todayLowPercent;
    }

    public void setTodayLowPercent(Float todayLowPercent) {
        this.todayLowPercent = todayLowPercent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getTodayPercent() {
        return todayPercent;
    }

    public void setTodayPercent(Float todayPercent) {
        this.todayPercent = todayPercent;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
}
