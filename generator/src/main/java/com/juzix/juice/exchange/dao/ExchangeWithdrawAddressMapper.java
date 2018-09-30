package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.ExchangeWithdrawAddress;
import java.util.List;

public interface ExchangeWithdrawAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExchangeWithdrawAddress record);

    ExchangeWithdrawAddress selectByPrimaryKey(Integer id);

    List<ExchangeWithdrawAddress> selectAll();

    int updateByPrimaryKey(ExchangeWithdrawAddress record);
}