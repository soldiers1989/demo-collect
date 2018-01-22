package org.sun.h2.db.mapper;

import org.sun.h2.db.entity.AliasPo;
import org.apache.ibatis.annotations.Param;
import org.sun.h2.db.mapper.common.BaseMapper;

/// @dev mapper对应xml中接口
public interface AliasMapper extends BaseMapper<String,AliasPo> {

    AliasPo getByAddress(@Param("address") String adderss);
}
