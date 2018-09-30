package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.Quote1Hour;
import java.util.List;

public interface Quote1HourMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Quote1Hour record);

    Quote1Hour selectByPrimaryKey(Integer id);

    List<Quote1Hour> selectAll();

    int updateByPrimaryKey(Quote1Hour record);
}