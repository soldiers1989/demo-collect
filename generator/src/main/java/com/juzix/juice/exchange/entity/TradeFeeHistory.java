package com.juzix.juice.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TradeFeeHistory {
    private Integer id;

    private String bizCode;

    private String baseCoin;

    private String tradeCoin;

    private BigDecimal brokerFee;

    private BigDecimal exchangeFee;

    private Date effectiveTime;

    private Date expireTime;

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

    public Date getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
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