package com.juzix.juice.exchange.entity;

public class HotWalletAlarmRecvHistory {
    private Integer hotWalletAlarmHistoryId;

    private Integer receiverUserId;

    public Integer getHotWalletAlarmHistoryId() {
        return hotWalletAlarmHistoryId;
    }

    public void setHotWalletAlarmHistoryId(Integer hotWalletAlarmHistoryId) {
        this.hotWalletAlarmHistoryId = hotWalletAlarmHistoryId;
    }

    public Integer getReceiverUserId() {
        return receiverUserId;
    }

    public void setReceiverUserId(Integer receiverUserId) {
        this.receiverUserId = receiverUserId;
    }
}