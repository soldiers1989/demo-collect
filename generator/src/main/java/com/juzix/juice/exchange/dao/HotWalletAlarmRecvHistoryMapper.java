package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.HotWalletAlarmRecvHistory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotWalletAlarmRecvHistoryMapper {
    int deleteByPrimaryKey(@Param("hotWalletAlarmHistoryId") Integer hotWalletAlarmHistoryId, @Param("receiverUserId") Integer receiverUserId);

    int insert(HotWalletAlarmRecvHistory record);

    List<HotWalletAlarmRecvHistory> selectAll();
}