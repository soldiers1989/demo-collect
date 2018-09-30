package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.ProfitDetail;
import java.util.List;

public interface ProfitDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProfitDetail record);

    ProfitDetail selectByPrimaryKey(Integer id);

    List<ProfitDetail> selectAll();

    int updateByPrimaryKey(ProfitDetail record);
}