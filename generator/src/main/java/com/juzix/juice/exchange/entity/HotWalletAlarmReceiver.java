package com.juzix.juice.exchange.entity;

public class HotWalletAlarmReceiver {
    private String coin;

    private Integer receiverUserId;

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin == null ? null : coin.trim();
    }

    public Integer getReceiverUserId() {
        return receiverUserId;
    }

    public void setReceiverUserId(Integer receiverUserId) {
        this.receiverUserId = receiverUserId;
    }
}