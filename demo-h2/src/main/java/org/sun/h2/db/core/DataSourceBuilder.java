package org.sun.h2.db.core;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author Jungle
 * @create 2018-01-19 16:49
 */
public class DataSourceBuilder extends UnpooledDataSourceFactory {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public DataSourceBuilder() {
        try {
            DruidDataSource druidDataSource = new DruidDataSource();
            Properties properties = new Properties();
            InputStream in = this.getClass().getResourceAsStream("/db_config.properties");
            properties.load(in);
            in.close();

            long maxWait = Long.parseLong(properties.getProperty("druid.maxWait"));
            long timeBetweenEvictionRunsMillis = Long.parseLong(properties.getProperty("druid.timeBetweenEvictionRunsMillis"));
            druidDataSource.configFromPropety(properties);
            druidDataSource.setMaxWait(maxWait);
            druidDataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
            this.dataSource = druidDataSource;

        }catch (Exception e){
            System.out.println("...................");
            e.printStackTrace();
        }
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
