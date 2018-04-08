package com.maimieng.mapper;

import com.maimieng.model.MpcPartyRel;
import java.util.List;

public interface MpcPartyRelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MpcPartyRel record);

    MpcPartyRel selectByPrimaryKey(Integer id);

    List<MpcPartyRel> selectAll();

    int updateByPrimaryKey(MpcPartyRel record);
}