package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.InvestorAccount;
import java.util.List;

public interface InvestorAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InvestorAccount record);

    InvestorAccount selectByPrimaryKey(Integer id);

    List<InvestorAccount> selectAll();

    int updateByPrimaryKey(InvestorAccount record);
}