package org.sun.h2.db.dao.impl;

import org.sun.h2.db.entity.AliasPo;
import org.sun.h2.db.dao.AliasDao;
import org.sun.h2.db.mapper.AliasMapper;

/**
 * 别名DAO实现类，此处由每一个实现者决定对具体mapper及接口的使用
 * @author Jungle
 * @create 2018-01-19 16:28
 */
public class AliasDaoImpl extends BaseDaoImpl<AliasMapper,String,AliasPo> implements AliasDao {

    public AliasDaoImpl() {
        super(AliasMapper.class);
    }


    @Override
    public AliasPo getByAddress(String address) {
        return getMapper().getByAddress(address);
    }
}
