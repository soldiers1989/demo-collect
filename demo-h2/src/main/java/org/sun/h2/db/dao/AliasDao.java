package org.sun.h2.db.dao;

import org.sun.h2.db.entity.AliasPo;

/**
 * Created by jungle on 2018/1/19.
 */
public interface AliasDao extends BaseDao<String, AliasPo> {

    /// @dev 根据地址获取别名设置
    AliasPo getByAddress(String address);
}
