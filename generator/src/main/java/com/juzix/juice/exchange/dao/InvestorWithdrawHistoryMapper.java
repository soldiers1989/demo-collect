package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.InvestorWithdrawHistory;
import java.util.List;

public interface InvestorWithdrawHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InvestorWithdrawHistory record);

    InvestorWithdrawHistory selectByPrimaryKey(Integer id);

    List<InvestorWithdrawHistory> selectAll();

    int updateByPrimaryKey(InvestorWithdrawHistory record);
}