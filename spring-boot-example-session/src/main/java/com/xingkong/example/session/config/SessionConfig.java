package com.xingkong.example.session.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author wanggan
 * @create 2019-03-08 22:19
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 10000, redisNamespace = "xingkong:session")
public class SessionConfig {
}
