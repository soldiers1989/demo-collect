package com.maimieng.mapper;

import com.maimieng.model.MpcApp;
import java.util.List;

public interface MpcAppMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MpcApp record);

    MpcApp selectByPrimaryKey(Integer id);

    List<MpcApp> selectAll();

    int updateByPrimaryKey(MpcApp record);
}