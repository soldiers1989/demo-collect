package com.juzix.juice.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BrokerAccount {
    private Integer id;

    private String brokerCode;

    private String coin;

    private BigDecimal cumIncome;

    private BigDecimal balance;

    private BigDecimal locked;

    private BigDecimal cumWithdraw;

    private BigDecimal balanceThreshold;

    private BigDecimal pledged;

    private Date createTime;

    private Date updateTime;

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

    public BigDecimal getCumIncome() {
        return cumIncome;
    }

    public void setCumIncome(BigDecimal cumIncome) {
        this.cumIncome = cumIncome;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLocked() {
        return locked;
    }

    public void setLocked(BigDecimal locked) {
        this.locked = locked;
    }

    public BigDecimal getCumWithdraw() {
        return cumWithdraw;
    }

    public void setCumWithdraw(BigDecimal cumWithdraw) {
        this.cumWithdraw = cumWithdraw;
    }

    public BigDecimal getBalanceThreshold() {
        return balanceThreshold;
    }

    public void setBalanceThreshold(BigDecimal balanceThreshold) {
        this.balanceThreshold = balanceThreshold;
    }

    public BigDecimal getPledged() {
        return pledged;
    }

    public void setPledged(BigDecimal pledged) {
        this.pledged = pledged;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}