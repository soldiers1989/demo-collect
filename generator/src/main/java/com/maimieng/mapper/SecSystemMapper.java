package com.maimieng.mapper;

import com.maimieng.model.SecSystem;
import java.util.List;

public interface SecSystemMapper {
    int deleteByPrimaryKey(String domain);

    int insert(SecSystem record);

    SecSystem selectByPrimaryKey(String domain);

    List<SecSystem> selectAll();

    int updateByPrimaryKey(SecSystem record);
}