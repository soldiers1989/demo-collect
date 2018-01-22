package org.sun.h2.db.mapper.common;

import java.io.Serializable;
import java.util.List;

/**
 * 基础Mapper类，此处为对应mybatis中xml对应的通用ID
 * @param <K>
 * @param <V>
 */
public interface BaseMapper<K extends Serializable, V> {

    int deleteByPrimaryKey(K key);

    int insert(V record);

    int insertSelective(V record);

    V selectByPrimaryKey(K key);

    int updateByPrimaryKeySelective(V record);

    int updateByPrimaryKeyWithBLOBs(V record);

    int updateByPrimaryKey(V record);

    int batchInsert(List<V> records);

    Long countAll();

}
