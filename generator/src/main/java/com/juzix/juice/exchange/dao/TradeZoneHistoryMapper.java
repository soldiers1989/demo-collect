package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.TradeZoneHistory;
import java.util.List;

public interface TradeZoneHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TradeZoneHistory record);

    TradeZoneHistory selectByPrimaryKey(Integer id);

    List<TradeZoneHistory> selectAll();

    int updateByPrimaryKey(TradeZoneHistory record);
}