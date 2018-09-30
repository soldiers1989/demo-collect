package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.Coin;
import java.util.List;

public interface CoinMapper {
    int deleteByPrimaryKey(String code);

    int insert(Coin record);

    Coin selectByPrimaryKey(String code);

    List<Coin> selectAll();

    int updateByPrimaryKey(Coin record);
}