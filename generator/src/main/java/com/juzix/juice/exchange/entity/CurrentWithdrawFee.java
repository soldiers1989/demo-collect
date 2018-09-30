package com.juzix.juice.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CurrentWithdrawFee {
    private Integer id;

    private String coin;

    private String withdrawer;

    private BigDecimal brokerFee;

    private BigDecimal exchangeFee;

    private BigDecimal paymentFee;

    private Date effectiveTime;

    private Date createTime;

    private Integer createUserId;

    private Date updateTime;

    private Integer updateUserId;

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

    public String getWithdrawer() {
        return withdrawer;
    }

    public void setWithdrawer(String withdrawer) {
        this.withdrawer = withdrawer == null ? null : withdrawer.trim();
    }

    public BigDecimal getBrokerFee() {
        return brokerFee;
    }

    public void setBrokerFee(BigDecimal brokerFee) {
        this.brokerFee = brokerFee;
    }

    public BigDecimal getExchangeFee() {
        return exchangeFee;
    }

    public void setExchangeFee(BigDecimal exchangeFee) {
        this.exchangeFee = exchangeFee;
    }

    public BigDecimal getPaymentFee() {
        return paymentFee;
    }

    public void setPaymentFee(BigDecimal paymentFee) {
        this.paymentFee = paymentFee;
    }

    public Date getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }
}