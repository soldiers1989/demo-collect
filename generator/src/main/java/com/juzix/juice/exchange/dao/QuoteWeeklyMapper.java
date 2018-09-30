package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.QuoteWeekly;
import java.util.List;

public interface QuoteWeeklyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuoteWeekly record);

    QuoteWeekly selectByPrimaryKey(Integer id);

    List<QuoteWeekly> selectAll();

    int updateByPrimaryKey(QuoteWeekly record);
}