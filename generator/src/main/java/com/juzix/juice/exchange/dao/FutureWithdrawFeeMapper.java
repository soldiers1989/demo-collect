package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.FutureWithdrawFee;
import java.util.List;

public interface FutureWithdrawFeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FutureWithdrawFee record);

    FutureWithdrawFee selectByPrimaryKey(Integer id);

    List<FutureWithdrawFee> selectAll();

    int updateByPrimaryKey(FutureWithdrawFee record);
}