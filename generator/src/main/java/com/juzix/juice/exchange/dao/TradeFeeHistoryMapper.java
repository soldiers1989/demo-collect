package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.TradeFeeHistory;
import java.util.List;

public interface TradeFeeHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TradeFeeHistory record);

    TradeFeeHistory selectByPrimaryKey(Integer id);

    List<TradeFeeHistory> selectAll();

    int updateByPrimaryKey(TradeFeeHistory record);
}