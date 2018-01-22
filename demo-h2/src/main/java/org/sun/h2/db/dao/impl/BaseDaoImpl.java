package org.sun.h2.db.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.sun.h2.db.dao.BaseDao;
import org.sun.h2.db.mapper.common.BaseMapper;
import org.sun.h2.db.mybatis.session.SessionManager;
import org.sun.h2.db.mybatis.transaction.TransactionAnnotation;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 * @param <T> mapper 接口
 * @param <K> mybatis 接口调用的入参类型
 * @param <V> mybatis 接口返回类型
 */
public abstract class BaseDaoImpl<T extends BaseMapper<K, V>, K extends Serializable , V> implements BaseDao<K,V> {

    private Class<T> mapperClass;

    // 父类获取mybatis接口
    public BaseDaoImpl(Class<T> mapperClass) {
        this.mapperClass = mapperClass;
    }

    public SqlSession getSession(){
        return SessionManager.getSession();
    }

    // 获取mybatis对应的mapper代理对象
    public T getMapper(){
        return getSession().getMapper(mapperClass);
    }

    @TransactionAnnotation
    @Override
    public int save(V v) {
        return getMapper().insert(v);
    }

    @TransactionAnnotation
    @Override
    public int save(List<V> list) {
        return getMapper().batchInsert(list);
    }

    @TransactionAnnotation
    @Override
    public int update(V v) {
        return getMapper().updateByPrimaryKey(v);
    }

    @TransactionAnnotation
    @Override
    public int update(List<V> list) {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += update(list.get(i));
        }
        return result;
    }

    @Override
    public V get(K k) {
        return this.getMapper().selectByPrimaryKey(k);
    }

    @Override
    public int delete(K k) {
        return this.getMapper().deleteByPrimaryKey(k);
    }

    @Override
    public List<V> getList() {
        return null;
    }

    @Override
    public List<V> getList(Map<String, Object> params) {
        return null;
    }

    @Override
    public Long getCount() {
        return getMapper().countAll();
    }
}
