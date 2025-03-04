package com.example.redisdbapp.biding;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("StudentHash")
public class Student {

	private Integer id;
	private String name;
}
