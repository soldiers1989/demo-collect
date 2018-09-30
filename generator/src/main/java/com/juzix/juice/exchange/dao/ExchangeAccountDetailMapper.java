package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.ExchangeAccountDetail;
import java.util.List;

public interface ExchangeAccountDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExchangeAccountDetail record);

    ExchangeAccountDetail selectByPrimaryKey(Integer id);

    List<ExchangeAccountDetail> selectAll();

    int updateByPrimaryKey(ExchangeAccountDetail record);
}