package com.maimieng.mapper;

import com.maimieng.model.MpcRoomNodeRel;
import java.util.List;

public interface MpcRoomNodeRelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MpcRoomNodeRel record);

    MpcRoomNodeRel selectByPrimaryKey(Integer id);

    List<MpcRoomNodeRel> selectAll();

    int updateByPrimaryKey(MpcRoomNodeRel record);
}