package com.maimieng.mapper;

import com.maimieng.model.SecUser;
import java.util.List;

public interface SecUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SecUser record);

    SecUser selectByPrimaryKey(Integer id);

    List<SecUser> selectAll();

    int updateByPrimaryKey(SecUser record);
}