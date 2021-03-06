package com.lk.test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
@EnableAutoConfiguration
@PropertySource("classpath:redis.properties")
public class RedisConfig {  

    @Bean
    @ConfigurationProperties(prefix="spring.redis.poolConfig")
    public JedisPoolConfig getRedisConfig(){    
        JedisPoolConfig config = new JedisPoolConfig();
        return config;
    }

    @Bean
    @ConfigurationProperties(prefix="spring.redis")
    public JedisConnectionFactory getConnectionFactory(){    
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setUsePool(true);  
        JedisPoolConfig config = getRedisConfig();    
        factory.setPoolConfig(config);    
        return factory;    
    }


    @Bean
    public RedisTemplate<?, ?> getRedisTemplate(){
        RedisTemplate<?,?> template = new StringRedisTemplate(getConnectionFactory());
        return template;    
    }    
      
}  