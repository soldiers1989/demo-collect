package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.BrokerHistory;
import java.util.List;

public interface BrokerHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BrokerHistory record);

    BrokerHistory selectByPrimaryKey(Integer id);

    List<BrokerHistory> selectAll();

    int updateByPrimaryKey(BrokerHistory record);
}