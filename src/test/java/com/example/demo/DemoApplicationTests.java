package com.example.demo;

import com.example.demo.entity.Days;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Date;
@SpringBootTest
class DemoApplicationTests {


    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @Test
    public void setRedisTemplate() {
        redisTemplate.opsForValue().set("days", "123");
        System.out.println(redisTemplate.opsForValue().get("days"));
    }

    @Test
    void contextLoads() {

        System.out.println(System.currentTimeMillis());
        System.out.println(new Date().getTime());
        System.out.println(System.nanoTime());
        System.out.println(LocalDate.now());

        String s = null;
        if ("null".equals(s)) {
            System.out.println(String.valueOf(s));
        }
        System.out.println(1000 == 1000);
        System.out.println(100 == 100);


    }

}
