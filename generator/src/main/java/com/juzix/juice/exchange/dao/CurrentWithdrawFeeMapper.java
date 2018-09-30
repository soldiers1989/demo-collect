package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.CurrentWithdrawFee;
import java.util.List;

public interface CurrentWithdrawFeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CurrentWithdrawFee record);

    CurrentWithdrawFee selectByPrimaryKey(Integer id);

    List<CurrentWithdrawFee> selectAll();

    int updateByPrimaryKey(CurrentWithdrawFee record);
}