package com.maimieng.mapper;

import com.maimieng.model.MpcRoom;
import java.util.List;

public interface MpcRoomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MpcRoom record);

    MpcRoom selectByPrimaryKey(Integer id);

    List<MpcRoom> selectAll();

    int updateByPrimaryKey(MpcRoom record);
}