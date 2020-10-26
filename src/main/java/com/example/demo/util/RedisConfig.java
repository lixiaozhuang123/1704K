package com.example.demo.util;

//@Configuration
//public class RedisConfig{
//    @Bean
//    public RedisTemplate<String, Days>redisTemplate(RedisConnectionFactory factory){
//        RedisTemplate<String,Days>template=new RedisTemplate<>();
//        //关联
//        template.setConnectionFactory(factory);
//        //设置key的序列化器
//        template.setKeySerializer(new StringRedisSerializer());
//        //设置value的序列化器
//        template.setValueSerializer(new Jackson2JsonRedisSerializer<>(Days.class));
//        return template;
//    }
//}