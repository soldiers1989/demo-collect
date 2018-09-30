package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.QuoteDaily;
import java.util.List;

public interface QuoteDailyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuoteDaily record);

    QuoteDaily selectByPrimaryKey(Integer id);

    List<QuoteDaily> selectAll();

    int updateByPrimaryKey(QuoteDaily record);
}