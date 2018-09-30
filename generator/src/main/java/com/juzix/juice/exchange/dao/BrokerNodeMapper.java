package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.BrokerNode;
import java.util.List;

public interface BrokerNodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BrokerNode record);

    BrokerNode selectByPrimaryKey(Integer id);

    List<BrokerNode> selectAll();

    int updateByPrimaryKey(BrokerNode record);
}