package com.maimieng.mapper;

import com.maimieng.model.SecRoleResource;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecRoleResourceMapper {
    int deleteByPrimaryKey(@Param("role_id") Integer role_id, @Param("resource_id") Integer resource_id);

    int insert(SecRoleResource record);

    List<SecRoleResource> selectAll();
}