package org.sun.h2.db.core;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.sun.h2.db.mybatis.session.SessionManager;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

/**
 * @author Jungle
 * @create 2018-01-19 16:42
 */
public class DBManager {

    private SqlSessionFactory sqlSessionFactory;

    /// @dev 初始化SqlSessionFactory
    public void initSqlSessionFactory() throws IOException, SQLException {
        String resource = "mybatis/mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SessionManager.sqlSessionFactory = sqlSessionFactory;
    }

    public void shutdown() {
        if (sqlSessionFactory != null) {
            DruidDataSource druidDataSource = (DruidDataSource) sqlSessionFactory.getConfiguration().getEnvironment().getDataSource();
            druidDataSource.close();
            sqlSessionFactory = null;
            SessionManager.sqlSessionFactory = null;
        }
    }

    public void destroy() {
        shutdown();
    }

    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
}
