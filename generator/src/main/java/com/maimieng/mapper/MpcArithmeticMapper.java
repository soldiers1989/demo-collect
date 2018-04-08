package com.maimieng.mapper;

import com.maimieng.model.MpcArithmetic;
import java.util.List;

public interface MpcArithmeticMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MpcArithmetic record);

    MpcArithmetic selectByPrimaryKey(Integer id);

    List<MpcArithmetic> selectAll();

    int updateByPrimaryKey(MpcArithmetic record);
}