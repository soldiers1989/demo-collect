package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.MatchDeal;
import java.util.List;

public interface MatchDealMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MatchDeal record);

    MatchDeal selectByPrimaryKey(Integer id);

    List<MatchDeal> selectAll();

    int updateByPrimaryKey(MatchDeal record);
}