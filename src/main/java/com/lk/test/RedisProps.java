package com.lk.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix="spring.redis")
@PropertySource("classpath:redis.properties")
//@PropertySource("classpath:redis.yml")
public class RedisProps {  

    private int dbIndex;  
    @NotNull
    private String hostname;
    private String password;  
    @NotNull  
    private int port;  
    private long timeout;  
    private List<Map<String,String>> poolConfig;
      
    public int getDbIndex() {  
        return dbIndex;  
    }  
    public void setDbIndex(int dbIndex) {  
        this.dbIndex = dbIndex;  
    }  
    public String getHostname() {  
        return hostname;  
    }  
    public void setHostname(String hostname) {  
        this.hostname = hostname;  
    }  
    public String getPassword() {  
        return password;  
    }  
    public void setPassword(String password) {  
        this.password = password;  
    }  
    public int getPort() {  
        return port;  
    }  
    public void setPort(int port) {  
        this.port = port;  
    }  
    public long getTimeout() {  
        return timeout;  
    }  
    public void setTimeout(long timeout) {  
        this.timeout = timeout;  
    }  
    public List<Map<String, String>> getPoolConfig() {
        return poolConfig;  
    }  
    public void setPoolConfig(List<Map<String, String>> poolConfig) {  
        this.poolConfig = poolConfig;  
    }


    @Override
    public String toString() {
        return "RedisProps{" +
                "dbIndex=" + dbIndex +
                ", hostname='" + hostname + '\'' +
                ", password='" + password + '\'' +
                ", port=" + port +
                ", timeout=" + timeout +
                ", poolConfig=" + poolConfig +
                '}';
    }
}