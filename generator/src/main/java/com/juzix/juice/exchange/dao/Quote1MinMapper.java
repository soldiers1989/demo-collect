package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.Quote1Min;
import java.util.List;

public interface Quote1MinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Quote1Min record);

    Quote1Min selectByPrimaryKey(Integer id);

    List<Quote1Min> selectAll();

    int updateByPrimaryKey(Quote1Min record);
}