package com.maimieng.mapper;

import com.maimieng.model.Audit;
import java.util.List;

public interface AuditMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Audit record);

    Audit selectByPrimaryKey(Integer id);

    List<Audit> selectAll();

    int updateByPrimaryKey(Audit record);
}