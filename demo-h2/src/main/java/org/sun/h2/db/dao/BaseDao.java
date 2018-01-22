package org.sun.h2.db.dao;

import java.util.List;
import java.util.Map;

/**
 * 基础DAO类，包含基础操作
 * @param <K> 返回参数类型
 * @param <T> 入参类型
 */
public interface BaseDao<K,T> {

    int save(T t);

    int save(List<T> list);

    int update(T t);

    int update(List<T> list);

    T get(K k);

    int delete(K k);

    List<T> getList();

    List<T> getList(Map<String, Object> params);

    Long getCount();

}
