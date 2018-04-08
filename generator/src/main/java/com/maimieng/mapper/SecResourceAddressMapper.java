package com.maimieng.mapper;

import com.maimieng.model.SecResourceAddress;
import java.util.List;

public interface SecResourceAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SecResourceAddress record);

    SecResourceAddress selectByPrimaryKey(Integer id);

    List<SecResourceAddress> selectAll();

    int updateByPrimaryKey(SecResourceAddress record);
}