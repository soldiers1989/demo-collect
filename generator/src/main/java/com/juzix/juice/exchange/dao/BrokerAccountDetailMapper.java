package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.BrokerAccountDetail;
import java.util.List;

public interface BrokerAccountDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BrokerAccountDetail record);

    BrokerAccountDetail selectByPrimaryKey(Integer id);

    List<BrokerAccountDetail> selectAll();

    int updateByPrimaryKey(BrokerAccountDetail record);
}