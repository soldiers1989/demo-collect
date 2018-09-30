package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.HotWalletAlarmTriggerHistory;
import java.util.List;

public interface HotWalletAlarmTriggerHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotWalletAlarmTriggerHistory record);

    HotWalletAlarmTriggerHistory selectByPrimaryKey(Integer id);

    List<HotWalletAlarmTriggerHistory> selectAll();

    int updateByPrimaryKey(HotWalletAlarmTriggerHistory record);
}