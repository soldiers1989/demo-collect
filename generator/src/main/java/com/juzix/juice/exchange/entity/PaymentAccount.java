package com.juzix.juice.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentAccount {
    private Integer id;

    private String coin;

    private BigDecimal cumIncome;

    private BigDecimal balance;

    private BigDecimal locked;

    private BigDecimal cumWithdraw;

    private Date createTime;

    private Date updateTime;

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