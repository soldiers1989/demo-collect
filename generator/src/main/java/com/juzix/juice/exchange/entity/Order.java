package com.juzix.juice.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer id;

    private String brokerCode;

    private String orderNo;

    private String investorCode;

    private String baseCoin;

    private String tradeCoin;

    private Integer orderType;

    private String side;

    private BigDecimal price;

    private BigDecimal volume;

    private BigDecimal threshold;

    private Integer status;

    private BigDecimal executionVolume;

    private BigDecimal leavesVolume;

    private BigDecimal turnover;

    private BigDecimal avgPrice;

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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getInvestorCode() {
        return investorCode;
    }

    public void setInvestorCode(String investorCode) {
        this.investorCode = investorCode == null ? null : investorCode.trim();
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

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side == null ? null : side.trim();
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

    public BigDecimal getThreshold() {
        return threshold;
    }

    public void setThreshold(BigDecimal threshold) {
        this.threshold = threshold;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getExecutionVolume() {
        return executionVolume;
    }

    public void setExecutionVolume(BigDecimal executionVolume) {
        this.executionVolume = executionVolume;
    }

    public BigDecimal getLeavesVolume() {
        return leavesVolume;
    }

    public void setLeavesVolume(BigDecimal leavesVolume) {
        this.leavesVolume = leavesVolume;
    }

    public BigDecimal getTurnover() {
        return turnover;
    }

    public void setTurnover(BigDecimal turnover) {
        this.turnover = turnover;
    }

    public BigDecimal getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(BigDecimal avgPrice) {
        this.avgPrice = avgPrice;
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