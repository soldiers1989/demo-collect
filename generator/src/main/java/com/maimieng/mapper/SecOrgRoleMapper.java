package com.maimieng.mapper;

import com.maimieng.model.SecOrgRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecOrgRoleMapper {
    int deleteByPrimaryKey(@Param("org_id") Integer org_id, @Param("role_id") Integer role_id);

    int insert(SecOrgRole record);

    List<SecOrgRole> selectAll();
}