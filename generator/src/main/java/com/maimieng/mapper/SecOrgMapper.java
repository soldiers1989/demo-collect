package com.maimieng.mapper;

import com.maimieng.model.SecOrg;
import java.util.List;

public interface SecOrgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SecOrg record);

    SecOrg selectByPrimaryKey(Integer id);

    List<SecOrg> selectAll();

    int updateByPrimaryKey(SecOrg record);
}