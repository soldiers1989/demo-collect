package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.BrokerTradeZone;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrokerTradeZoneMapper {
    int deleteByPrimaryKey(@Param("brokerCode") String brokerCode, @Param("baseCoin") String baseCoin, @Param("tradeCoin") String tradeCoin);

    int insert(BrokerTradeZone record);

    BrokerTradeZone selectByPrimaryKey(@Param("brokerCode") String brokerCode, @Param("baseCoin") String baseCoin, @Param("tradeCoin") String tradeCoin);

    List<BrokerTradeZone> selectAll();

    int updateByPrimaryKey(BrokerTradeZone record);
}