package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.FutureTradeFee;
import java.util.List;

public interface FutureTradeFeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FutureTradeFee record);

    FutureTradeFee selectByPrimaryKey(Integer id);

    List<FutureTradeFee> selectAll();

    int updateByPrimaryKey(FutureTradeFee record);
}