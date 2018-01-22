package org.sun.h2.db.dao.impl;

import org.junit.Test;
import org.sun.h2.db.core.DBManager;
import org.sun.h2.db.dao.AliasDao;
import org.sun.h2.db.entity.AliasPo;
import org.sun.h2.db.mybatis.transaction.TransactionAOPFilterImpl;
import org.sun.h2.db.util.AOPUtils;

/**
 * Created by jungle on 2018/1/19.
 */
public class AliasDaoImplTest {

    private DBManager dbManager = new DBManager();
    private AliasDao aliasDao ;

    @Test
    public void getByAddress() {
        try {
            dbManager.initSqlSessionFactory();

            // 构建代理对象
            TransactionAOPFilterImpl transactionalFilter = new TransactionAOPFilterImpl();
            aliasDao = AOPUtils.createProxy(AliasDaoImpl.class, transactionalFilter);
            /*AliasPo aliasPo = new AliasPo();
            aliasPo.setAddress("xxxxxxxxxxxxx");
            aliasPo.setStatus(1);
            aliasPo.setAlias("大爷");
            aliasDao.save(aliasPo);*/
            AliasPo result = aliasDao.getByAddress("xxxxxxxxxxxxx");
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}