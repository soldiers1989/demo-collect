package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.CoinHistory;
import java.util.List;

public interface CoinHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CoinHistory record);

    CoinHistory selectByPrimaryKey(Integer id);

    List<CoinHistory> selectAll();

    int updateByPrimaryKey(CoinHistory record);
}