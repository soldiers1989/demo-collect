package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.InvestorAccountDetail;
import java.util.List;

public interface InvestorAccountDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InvestorAccountDetail record);

    InvestorAccountDetail selectByPrimaryKey(Integer id);

    List<InvestorAccountDetail> selectAll();

    int updateByPrimaryKey(InvestorAccountDetail record);
}