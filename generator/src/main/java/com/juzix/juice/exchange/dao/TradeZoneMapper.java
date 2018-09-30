package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.TradeZone;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeZoneMapper {
    int deleteByPrimaryKey(@Param("baseCoin") String baseCoin, @Param("tradeCoin") String tradeCoin);

    int insert(TradeZone record);

    TradeZone selectByPrimaryKey(@Param("baseCoin") String baseCoin, @Param("tradeCoin") String tradeCoin);

    List<TradeZone> selectAll();

    int updateByPrimaryKey(TradeZone record);
}