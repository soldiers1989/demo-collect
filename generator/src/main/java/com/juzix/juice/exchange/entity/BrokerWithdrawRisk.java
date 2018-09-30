package com.juzix.juice.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BrokerWithdrawRisk {
    private Integer id;

    private String brokerCode;

    private String coin;

    private BigDecimal minVolume;

    private BigDecimal maxVolume;

    private BigDecimal auditRequiredVolume;

    private BigDecimal dailyVolume;

    private Integer dailyTimes;

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

    public String getBrokerCode() {
        return brokerCode;
    }

    public void setBrokerCode(String brokerCode) {
        this.brokerCode = brokerCode == null ? null : brokerCode.trim();
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin == null ? null : coin.trim();
    }

    public BigDecimal getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(BigDecimal minVolume) {
        this.minVolume = minVolume;
    }

    public BigDecimal getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(BigDecimal maxVolume) {
        this.maxVolume = maxVolume;
    }

    public BigDecimal getAuditRequiredVolume() {
        return auditRequiredVolume;
    }

    public void setAuditRequiredVolume(BigDecimal auditRequiredVolume) {
        this.auditRequiredVolume = auditRequiredVolume;
    }

    public BigDecimal getDailyVolume() {
        return dailyVolume;
    }

    public void setDailyVolume(BigDecimal dailyVolume) {
        this.dailyVolume = dailyVolume;
    }

    public Integer getDailyTimes() {
        return dailyTimes;
    }

    public void setDailyTimes(Integer dailyTimes) {
        this.dailyTimes = dailyTimes;
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