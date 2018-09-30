package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.InvestorDepositAddress;
import java.util.List;

public interface InvestorDepositAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InvestorDepositAddress record);

    InvestorDepositAddress selectByPrimaryKey(Integer id);

    List<InvestorDepositAddress> selectAll();

    int updateByPrimaryKey(InvestorDepositAddress record);
}