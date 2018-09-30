package com.juzix.juice.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MatchDeal {
    private Integer id;

    private String activeOrderNo;

    private String passiveOrderNo;

    private String baseCoin;

    private String tradeCoin;

    private BigDecimal price;

    private BigDecimal executionVolume;

    private BigDecimal turnover;

    private BigDecimal activeFee;

    private BigDecimal passiveFee;

    private Date dealTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActiveOrderNo() {
        return activeOrderNo;
    }

    public void setActiveOrderNo(String activeOrderNo) {
        this.activeOrderNo = activeOrderNo == null ? null : activeOrderNo.trim();
    }

    public String getPassiveOrderNo() {
        return passiveOrderNo;
    }

    public void setPassiveOrderNo(String passiveOrderNo) {
        this.passiveOrderNo = passiveOrderNo == null ? null : passiveOrderNo.trim();
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getExecutionVolume() {
        return executionVolume;
    }

    public void setExecutionVolume(BigDecimal executionVolume) {
        this.executionVolume = executionVolume;
    }

    public BigDecimal getTurnover() {
        return turnover;
    }

    public void setTurnover(BigDecimal turnover) {
        this.turnover = turnover;
    }

    public BigDecimal getActiveFee() {
        return activeFee;
    }

    public void setActiveFee(BigDecimal activeFee) {
        this.activeFee = activeFee;
    }

    public BigDecimal getPassiveFee() {
        return passiveFee;
    }

    public void setPassiveFee(BigDecimal passiveFee) {
        this.passiveFee = passiveFee;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }
}