package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.BrokerInvestorStats;
import java.util.List;

public interface BrokerInvestorStatsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BrokerInvestorStats record);

    BrokerInvestorStats selectByPrimaryKey(Integer id);

    List<BrokerInvestorStats> selectAll();

    int updateByPrimaryKey(BrokerInvestorStats record);
}