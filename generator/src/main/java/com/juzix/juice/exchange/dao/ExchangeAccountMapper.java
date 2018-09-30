package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.ExchangeAccount;
import java.util.List;

public interface ExchangeAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExchangeAccount record);

    ExchangeAccount selectByPrimaryKey(Integer id);

    List<ExchangeAccount> selectAll();

    int updateByPrimaryKey(ExchangeAccount record);
}