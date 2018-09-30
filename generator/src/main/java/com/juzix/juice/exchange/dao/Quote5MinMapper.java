package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.Quote5Min;
import java.util.List;

public interface Quote5MinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Quote5Min record);

    Quote5Min selectByPrimaryKey(Integer id);

    List<Quote5Min> selectAll();

    int updateByPrimaryKey(Quote5Min record);
}