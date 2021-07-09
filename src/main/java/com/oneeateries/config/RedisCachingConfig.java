package com.oneeateries.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import lombok.RequiredArgsConstructor;

@Configuration(proxyBeanMethods = false)
@EnableCaching
@RequiredArgsConstructor
public class RedisCachingConfig extends CachingConfigurerSupport{
    private final RedisConnectionFactory connectionFactory;
}
