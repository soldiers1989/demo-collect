package com.juzix.juice.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ProfitDetail {
    private Integer id;

    private String coin;

    private String bizCode;

    private String bizPromoterType;

    private String bizPromoterCode;

    private Date bizTime;

    private BigDecimal price;

    private BigDecimal volume;

    private BigDecimal turnover;

    private BigDecimal fee;

    private BigDecimal brokerProfit;

    private BigDecimal exchangeProfit;

    private BigDecimal paymentProfit;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin == null ? null : coin.trim();
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode == null ? null : bizCode.trim();
    }

    public String getBizPromoterType() {
        return bizPromoterType;
    }

    public void setBizPromoterType(String bizPromoterType) {
        this.bizPromoterType = bizPromoterType == null ? null : bizPromoterType.trim();
    }

    public String getBizPromoterCode() {
        return bizPromoterCode;
    }

    public void setBizPromoterCode(String bizPromoterCode) {
        this.bizPromoterCode = bizPromoterCode == null ? null : bizPromoterCode.trim();
    }

    public Date getBizTime() {
        return bizTime;
    }

    public void setBizTime(Date bizTime) {
        this.bizTime = bizTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getTurnover() {
        return turnover;
    }

    public void setTurnover(BigDecimal turnover) {
        this.turnover = turnover;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getBrokerProfit() {
        return brokerProfit;
    }

    public void setBrokerProfit(BigDecimal brokerProfit) {
        this.brokerProfit = brokerProfit;
    }

    public BigDecimal getExchangeProfit() {
        return exchangeProfit;
    }

    public void setExchangeProfit(BigDecimal exchangeProfit) {
        this.exchangeProfit = exchangeProfit;
    }

    public BigDecimal getPaymentProfit() {
        return paymentProfit;
    }

    public void setPaymentProfit(BigDecimal paymentProfit) {
        this.paymentProfit = paymentProfit;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}