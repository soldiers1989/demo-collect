package com.juzix.juice.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

public class InvestorDepositHistory {
    private Integer id;

    private String investorCode;

    private String coin;

    private BigDecimal volume;

    private String fromAddress;

    private String toAddress;

    private Date depositTime;

    private String depositHash;

    private Date confirmTime;

    private String confirmHash;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInvestorCode() {
        return investorCode;
    }

    public void setInvestorCode(String investorCode) {
        this.investorCode = investorCode == null ? null : investorCode.trim();
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin == null ? null : coin.trim();
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress == null ? null : fromAddress.trim();
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress == null ? null : toAddress.trim();
    }

    public Date getDepositTime() {
        return depositTime;
    }

    public void setDepositTime(Date depositTime) {
        this.depositTime = depositTime;
    }

    public String getDepositHash() {
        return depositHash;
    }

    public void setDepositHash(String depositHash) {
        this.depositHash = depositHash == null ? null : depositHash.trim();
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getConfirmHash() {
        return confirmHash;
    }

    public void setConfirmHash(String confirmHash) {
        this.confirmHash = confirmHash == null ? null : confirmHash.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}