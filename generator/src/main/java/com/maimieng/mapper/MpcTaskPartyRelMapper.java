package com.maimieng.mapper;

import com.maimieng.model.MpcTaskPartyRel;
import java.util.List;

public interface MpcTaskPartyRelMapper {
    int insert(MpcTaskPartyRel record);

    List<MpcTaskPartyRel> selectAll();
}