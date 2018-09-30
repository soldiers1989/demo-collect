package com.juzix.juice.exchange.entity;

public class InvestorDepositAddress {
    private Integer id;

    private String investorCode;

    private String coin;

    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}