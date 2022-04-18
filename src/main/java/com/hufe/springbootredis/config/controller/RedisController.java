package com.hufe.springbootredis.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MSSH
 */
@RestController
@RequestMapping("/testRedis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("link")
    public String testLinked() {
        redisTemplate.opsForValue().set("name", "wusong");
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println(name);
        return (String) name;
    }
}
