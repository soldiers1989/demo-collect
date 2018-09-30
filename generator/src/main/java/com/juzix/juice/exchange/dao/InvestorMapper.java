package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.Investor;
import java.util.List;

public interface InvestorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Investor record);

    Investor selectByPrimaryKey(Integer id);

    List<Investor> selectAll();

    int updateByPrimaryKey(Investor record);
}