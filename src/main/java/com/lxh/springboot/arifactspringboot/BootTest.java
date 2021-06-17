package com.lxh.springboot.arifactspringboot;

import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;


import javax.annotation.Resource;

/**
 * 描述:
 *
 * @author 刘晓禾
 * @create 2021-06-17 17:44
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootTest {
    @Resource
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void set(){
        redisTemplate.opsForValue().set("myKey","myValue");
        System.out.println(redisTemplate.opsForValue().get("myKey"));
    }
}