package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.BrokerDepositHistory;
import java.util.List;

public interface BrokerDepositHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BrokerDepositHistory record);

    BrokerDepositHistory selectByPrimaryKey(Integer id);

    List<BrokerDepositHistory> selectAll();

    int updateByPrimaryKey(BrokerDepositHistory record);
}