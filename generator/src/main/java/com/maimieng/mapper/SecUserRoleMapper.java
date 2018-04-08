package com.maimieng.mapper;

import com.maimieng.model.SecUserRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecUserRoleMapper {
    int deleteByPrimaryKey(@Param("user_id") Integer user_id, @Param("role_id") Integer role_id);

    int insert(SecUserRole record);

    List<SecUserRole> selectAll();
}