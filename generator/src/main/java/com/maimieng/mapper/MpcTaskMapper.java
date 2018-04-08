package com.maimieng.mapper;

import com.maimieng.model.MpcTask;
import java.util.List;

public interface MpcTaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MpcTask record);

    MpcTask selectByPrimaryKey(Integer id);

    List<MpcTask> selectAll();

    int updateByPrimaryKey(MpcTask record);
}