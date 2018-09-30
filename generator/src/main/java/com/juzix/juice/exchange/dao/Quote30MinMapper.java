package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.Quote30Min;
import java.util.List;

public interface Quote30MinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Quote30Min record);

    Quote30Min selectByPrimaryKey(Integer id);

    List<Quote30Min> selectAll();

    int updateByPrimaryKey(Quote30Min record);
}