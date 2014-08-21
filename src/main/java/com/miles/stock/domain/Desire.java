package com.miles.stock.domain;

/**
 * 预期
 *
 * @author miles
 * @datetime 2014/5/27 15:27
 */
public class Desire {
    private String id;
    private Stock stock;
    /**
     * 目标购买价格
     */
    private Float buyPrice;
    /**
     * 目标卖出价格
     */
    private Float salePrice;
    /**
     * 精度
     */
    private Float scale;
    private Integer status;

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Float getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Float buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Float salePrice) {
        this.salePrice = salePrice;
    }

    public Float getScale() {
        return scale;
    }

    public void setScale(Float scale) {
        this.scale = scale;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
