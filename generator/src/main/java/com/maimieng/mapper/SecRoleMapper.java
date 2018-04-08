package com.maimieng.mapper;

import com.maimieng.model.SecRole;
import java.util.List;

public interface SecRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SecRole record);

    SecRole selectByPrimaryKey(Integer id);

    List<SecRole> selectAll();

    int updateByPrimaryKey(SecRole record);
}