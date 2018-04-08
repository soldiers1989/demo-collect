package com.maimieng.mapper;

import com.maimieng.model.SystemConfig;
import java.util.List;

public interface SystemConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemConfig record);

    SystemConfig selectByPrimaryKey(Integer id);

    List<SystemConfig> selectAll();

    int updateByPrimaryKey(SystemConfig record);
}