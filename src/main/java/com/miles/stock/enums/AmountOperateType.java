package com.miles.stock.enums;

/**
 * 资金操作类型
 * Created by miles on 2014/5/27.
 */
public enum AmountOperateType {
    INVEST(1),
    DISINVEST(2);
    private Integer value;

    public Integer getValue() {
        return value;
    }

    AmountOperateType(Integer value) {
        this.value = value;
    }
}
