package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.HotWalletAlarm;
import java.util.List;

public interface HotWalletAlarmMapper {
    int deleteByPrimaryKey(String coin);

    int insert(HotWalletAlarm record);

    HotWalletAlarm selectByPrimaryKey(String coin);

    List<HotWalletAlarm> selectAll();

    int updateByPrimaryKey(HotWalletAlarm record);
}