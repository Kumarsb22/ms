package com.example.redisdbapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import redis.clients.jedis.JedisClientConfig;

@Configuration
public class RedisConfig {

	@Value("${sprin.data.redis.url}")
	private String url;
	@Value("${sprin.data.redis.port}")
	private Integer port;
	@Value("${sprin.data.redis.username}")
	private String username;
	@Value("${sprin.data.redis.password}")
	private String password;

	public JedisConnectionFactory jedisConnectionFactory() {
		RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration();
		configuration.setUsername(username);
		configuration.setPassword(password);
		JedisClientConfiguration jedisClientConfiguration = JedisClientConfiguration.builder().build();

		return new JedisConnectionFactory(configuration, jedisClientConfiguration);

	}
}
