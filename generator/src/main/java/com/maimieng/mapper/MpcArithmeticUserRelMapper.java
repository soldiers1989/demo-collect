package com.maimieng.mapper;

import com.maimieng.model.MpcArithmeticUserRel;
import java.util.List;

public interface MpcArithmeticUserRelMapper {
    int insert(MpcArithmeticUserRel record);

    List<MpcArithmeticUserRel> selectAll();
}