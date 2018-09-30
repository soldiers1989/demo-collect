package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.Broker;
import java.util.List;

public interface BrokerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Broker record);

    Broker selectByPrimaryKey(Integer id);

    List<Broker> selectAll();

    int updateByPrimaryKey(Broker record);
}