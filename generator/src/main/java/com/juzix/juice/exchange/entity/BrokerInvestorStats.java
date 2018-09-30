package com.juzix.juice.exchange.entity;

import java.math.BigDecimal;

public class BrokerInvestorStats {
    private Integer id;

    private String brokerCode;

    private String bizCode;

    private String baseCoin;

    private String tradeCoin;

    private BigDecimal totalVolume;

    private BigDecimal totalTurnover;

    private Integer totalOrders;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrokerCode() {
        return brokerCode;
    }

    public void setBrokerCode(String brokerCode) {
        this.brokerCode = brokerCode == null ? null : brokerCode.trim();
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode == null ? null : bizCode.trim();
    }

    public String getBaseCoin() {
        return baseCoin;
    }

    public void setBaseCoin(String baseCoin) {
        this.baseCoin = baseCoin == null ? null : baseCoin.trim();
    }

    public String getTradeCoin() {
        return tradeCoin;
    }

    public void setTradeCoin(String tradeCoin) {
        this.tradeCoin = tradeCoin == null ? null : tradeCoin.trim();
    }

    public BigDecimal getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(BigDecimal totalVolume) {
        this.totalVolume = totalVolume;
    }

    public BigDecimal getTotalTurnover() {
        return totalTurnover;
    }

    public void setTotalTurnover(BigDecimal totalTurnover) {
        this.totalTurnover = totalTurnover;
    }

    public Integer getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(Integer totalOrders) {
        this.totalOrders = totalOrders;
    }
}