package com.demo.controller;

import com.demo.config.redis.RedisContext;
import com.demo.utils.RedisUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/redis")
public class RedisController {

    private RedisUtils<String> redisUtilsFirst = RedisContext.getInstance().getRedisUtils("redisUtils1");

    private RedisUtils<String> redisUtilsSecond = RedisContext.getInstance().getRedisUtils("redisUtils2");

    @RequestMapping(value = "/set1")
    @ResponseBody
    public String set1(
            @RequestParam(value = "key") String key,
            @RequestParam(value = "value") String value
    ) {
        System.out.println("key: " + key + ", value: " + value);
        return String.valueOf(redisUtilsFirst.set(key, value));
    }

    @RequestMapping(value = "/set2")
    @ResponseBody
    public String set2(
            @RequestParam(value = "key") String key,
            @RequestParam(value = "value") String value
    ) {
        System.out.println("key: " + key + ", value: " + value);
        return String.valueOf(redisUtilsSecond.set(key, value));
    }

}
