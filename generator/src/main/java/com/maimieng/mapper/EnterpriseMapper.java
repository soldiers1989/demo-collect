package com.maimieng.mapper;

import com.maimieng.model.Enterprise;
import java.util.List;

public interface EnterpriseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Enterprise record);

    Enterprise selectByPrimaryKey(Integer id);

    List<Enterprise> selectAll();

    int updateByPrimaryKey(Enterprise record);
}