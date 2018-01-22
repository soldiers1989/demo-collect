package org.sun.h2.db.mybatis.session;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.sun.h2.db.exception.DBException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jungle
 * @create 2018-01-19 15:14
 */
public class SessionManager {

    public static SqlSessionFactory sqlSessionFactory;

    // sqlSession会话管理
    private static ThreadLocal<Map<String, SqlSession>> sessionHolder = new ThreadLocal<>();
    // 事务记录
    private static ThreadLocal<Map<String, Boolean>> txHolder = new ThreadLocal<>();
    // session id
    private static ThreadLocal<String> idHolder = new ThreadLocal<>();

    public static String getId(){
        return idHolder.get();
    }

    public static void setId(String id){
        idHolder.remove();
        idHolder.set(id);
    }

    public static SqlSession getSession(){
        return getSession(idHolder.get());
    }

    public static SqlSession getSession(String id){
        if(null == sqlSessionFactory){
            throw new DBException("数据库连接异常");
        }
        Map<String, SqlSession> mapSqlSession = sessionHolder.get();
        if(null == mapSqlSession || !mapSqlSession.containsKey(id)){
            return null;
        }
        return mapSqlSession.get(id);
    }

    public static void setSession(String id, SqlSession sqlSession) {
        Map<String, SqlSession> map = sessionHolder.get();
        if(null == map){
            map = new HashMap<>();
        }
        if(null == sqlSession){
            map.remove(id);
        }else{
            map.put(id, sqlSession);
        }
        sessionHolder.remove();
        sessionHolder.set(map);
    }

    public static void startTransaction(String id){
        Map<String, Boolean> txMap = txHolder.get();
        if(null == txMap){
            txMap = new HashMap<>();
        }
        txMap.put(id, true);
        txHolder.remove();
        txHolder.set(txMap);
    }

    public static void endTransaction(String id) {
        Map<String, Boolean> map = txHolder.get();
        if (map == null) {
            map = new HashMap<>();
        }
        map.remove(id);
        txHolder.remove();
        txHolder.set(map);
    }

    public static boolean getTxState(String id){
        if(null == id || "".equals(id)){
            return false;
        }
        Map<String ,Boolean> map = txHolder.get();
        if(null == map || !map.containsKey(id)){
            return false;
        }
        return map.get(id);
    }

}
