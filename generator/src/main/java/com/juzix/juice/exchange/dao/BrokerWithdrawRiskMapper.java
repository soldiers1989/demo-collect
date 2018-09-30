package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.BrokerWithdrawRisk;
import java.util.List;

public interface BrokerWithdrawRiskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BrokerWithdrawRisk record);

    BrokerWithdrawRisk selectByPrimaryKey(Integer id);

    List<BrokerWithdrawRisk> selectAll();

    int updateByPrimaryKey(BrokerWithdrawRisk record);
}