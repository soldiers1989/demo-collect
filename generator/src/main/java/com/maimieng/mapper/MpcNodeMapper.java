package com.maimieng.mapper;

import com.maimieng.model.MpcNode;
import java.util.List;

public interface MpcNodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MpcNode record);

    MpcNode selectByPrimaryKey(Integer id);

    List<MpcNode> selectAll();

    int updateByPrimaryKey(MpcNode record);
}