package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author Lenovo
 * @date 2020/9/3
 */
public class RedisController {

    @Autowired
    RedisTemplate redisTemplate;


    public void setRedisTemplate() {

    }
}