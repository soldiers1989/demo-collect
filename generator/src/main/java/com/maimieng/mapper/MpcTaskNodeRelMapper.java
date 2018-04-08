package com.maimieng.mapper;

import com.maimieng.model.MpcTaskNodeRel;
import java.util.List;

public interface MpcTaskNodeRelMapper {
    int insert(MpcTaskNodeRel record);

    List<MpcTaskNodeRel> selectAll();
}