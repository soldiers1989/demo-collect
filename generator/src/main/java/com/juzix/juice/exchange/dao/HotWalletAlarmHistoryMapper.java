package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.HotWalletAlarmHistory;
import java.util.List;

public interface HotWalletAlarmHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotWalletAlarmHistory record);

    HotWalletAlarmHistory selectByPrimaryKey(Integer id);

    List<HotWalletAlarmHistory> selectAll();

    int updateByPrimaryKey(HotWalletAlarmHistory record);
}