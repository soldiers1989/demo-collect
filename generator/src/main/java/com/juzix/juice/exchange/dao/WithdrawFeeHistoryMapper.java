package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.WithdrawFeeHistory;
import java.util.List;

public interface WithdrawFeeHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WithdrawFeeHistory record);

    WithdrawFeeHistory selectByPrimaryKey(Integer id);

    List<WithdrawFeeHistory> selectAll();

    int updateByPrimaryKey(WithdrawFeeHistory record);
}