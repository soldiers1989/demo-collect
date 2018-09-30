package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.InvestorDepositHistory;
import java.util.List;

public interface InvestorDepositHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InvestorDepositHistory record);

    InvestorDepositHistory selectByPrimaryKey(Integer id);

    List<InvestorDepositHistory> selectAll();

    int updateByPrimaryKey(InvestorDepositHistory record);
}