package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.BrokerDepositAddress;
import java.util.List;

public interface BrokerDepositAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BrokerDepositAddress record);

    BrokerDepositAddress selectByPrimaryKey(Integer id);

    List<BrokerDepositAddress> selectAll();

    int updateByPrimaryKey(BrokerDepositAddress record);
}