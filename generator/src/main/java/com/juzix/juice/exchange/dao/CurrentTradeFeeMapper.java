package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.CurrentTradeFee;
import java.util.List;

public interface CurrentTradeFeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CurrentTradeFee record);

    CurrentTradeFee selectByPrimaryKey(Integer id);

    List<CurrentTradeFee> selectAll();

    int updateByPrimaryKey(CurrentTradeFee record);
}