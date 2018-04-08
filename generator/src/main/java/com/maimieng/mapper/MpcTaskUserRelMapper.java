package com.maimieng.mapper;

import com.maimieng.model.MpcTaskUserRel;
import java.util.List;

public interface MpcTaskUserRelMapper {
    int insert(MpcTaskUserRel record);

    List<MpcTaskUserRel> selectAll();
}