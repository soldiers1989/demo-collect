package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.HotWalletAlarmReceiver;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotWalletAlarmReceiverMapper {
    int deleteByPrimaryKey(@Param("coin") String coin, @Param("receiverUserId") Integer receiverUserId);

    int insert(HotWalletAlarmReceiver record);

    List<HotWalletAlarmReceiver> selectAll();
}