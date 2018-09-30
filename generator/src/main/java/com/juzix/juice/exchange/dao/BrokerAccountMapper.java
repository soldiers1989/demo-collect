package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.BrokerAccount;
import java.util.List;

public interface BrokerAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BrokerAccount record);

    BrokerAccount selectByPrimaryKey(Integer id);

    List<BrokerAccount> selectAll();

    int updateByPrimaryKey(BrokerAccount record);
}