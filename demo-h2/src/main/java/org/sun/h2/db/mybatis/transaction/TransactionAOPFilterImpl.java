package org.sun.h2.db.mybatis.transaction;

import net.sf.cglib.proxy.MethodProxy;
import org.apache.ibatis.session.SqlSession;
import org.sun.h2.db.mybatis.session.SessionManager;
import org.sun.h2.db.util.StringUtils;

import java.lang.reflect.Method;


public class TransactionAOPFilterImpl implements TransactionAOPFilter {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        String lastId = SessionManager.getId();
        String id = lastId;
        Object result = null;
        boolean isSessionBegining  = false;
        boolean isCommit = false;
        if(null == id){
            id = StringUtils.getNewUUID();
        }
        if(method.isAnnotationPresent(TransactionAnnotation.class)){
            TransactionAnnotation annotation = method.getAnnotation(TransactionAnnotation.class);
            if(annotation.value() == Propagation.REQUIRED && !SessionManager.getTxState(id)){
                isCommit = true;
                id = StringUtils.getNewUUID();
            } else if(annotation.value() == Propagation.INDEPENDENT){
                id = StringUtils.getNewUUID();
            }
        }

        // 开启事务
        SqlSession session = SessionManager.getSession(id);
        if(null == session){
            isSessionBegining = true;
            session = SessionManager.sqlSessionFactory.openSession(false);
            SessionManager.setSession(id, session);
            SessionManager.setId(id);
        }else{
            isSessionBegining = false;
        }

        try {
            SessionManager.startTransaction(id);
            // 调用目标方法
            result = proxy.invokeSuper(obj, args);
            if(isCommit){
                session.commit();
                SessionManager.endTransaction(id);
            }
        }catch (Exception e){
            // 异常则回滚
            session.rollback();
            SessionManager.endTransaction(id);
        }finally {
            if (isSessionBegining) {
                SessionManager.setSession(id, null);
                SessionManager.setId(lastId);
                session.close();
            }
        }
        return result;
    }

    private boolean isFilterMethod(Method method) {
        return false;
    }
}
