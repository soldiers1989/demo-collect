package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.Quote15Min;
import java.util.List;

public interface Quote15MinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Quote15Min record);

    Quote15Min selectByPrimaryKey(Integer id);

    List<Quote15Min> selectAll();

    int updateByPrimaryKey(Quote15Min record);
}