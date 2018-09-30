package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.BrokerWithdrawHistory;
import java.util.List;

public interface BrokerWithdrawHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BrokerWithdrawHistory record);

    BrokerWithdrawHistory selectByPrimaryKey(Integer id);

    List<BrokerWithdrawHistory> selectAll();

    int updateByPrimaryKey(BrokerWithdrawHistory record);
}