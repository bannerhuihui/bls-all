package com.bls;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @program: bailesi
 * @description:
 * @author: Mr.Yuan
 * @create: 2022-01-24 02:17
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {


    @Autowired
    private RedisTemplate redisTemplate;


    @Test
    public void redisTest(){

        redisTemplate.opsForValue().set("hello","1");

        //判断是否有key所对应的值，有则返回true，没有则返回false
        redisTemplate.hasKey("hello");
        //有则取出key值所对应的值
        Object hello = redisTemplate.opsForValue().get("hello");

        //删除单个key值
        redisTemplate.delete("key");

        //批量删除key
        Collection<String> keys = new ArrayList<>();
        keys.add("key");
        keys.add("hello");
        redisTemplate.delete(keys); //其中keys:Collection<K> keys

        //将当前传入的key值序列化为byte[]类型
        byte[] key = "hello".getBytes();
        redisTemplate.dump(key);

        //设置过期时间为10分钟
        //TimeUnit.DAYS          //天
        //TimeUnit.HOURS         //小时
        //TimeUnit.MINUTES       //分钟
        //TimeUnit.SECONDS       //秒
        //TimeUnit.MILLISECONDS  //毫秒
        redisTemplate.expire("hello", 10, TimeUnit.MINUTES);

        redisTemplate.expireAt(key, new Date(1293840000));

        //查找匹配的key值，返回一个Set集合类型
        Set keys1 = redisTemplate.keys("pattern");

        //修改redis中key的名称
        redisTemplate.rename("oldKey", "newKey");

        //返回传入key所存储的值的类型
        redisTemplate.type("key");

        //如果旧值存在时，将旧值改为新值
        redisTemplate.renameIfAbsent("oldKey", "newKey");

        //从redis中随机取出一个key
        redisTemplate.randomKey();

        //返回当前key所对应的剩余过期时间
        redisTemplate.getExpire("key");

        //返回剩余过期时间并且指定时间单位
        Long expire = redisTemplate.getExpire(key, TimeUnit.SECONDS);

        //持久化保存
        redisTemplate.persist(key);

        //将当前数据库的key移动到指定redis中数据库当中
        redisTemplate.move("key", 1);

        //设置当前的key以及value值
        redisTemplate.opsForValue().set("key", "value");

        //设置当前的key以及value值并且设置过期时间
        redisTemplate.opsForValue().set("key", "value", 10, TimeUnit.MINUTES);


        System.out.println();
    }


    @Test
    public  void   test1(){
        redisTemplate.opsForValue().set("hello","1001");
        Object hello = redisTemplate.opsForValue().get("hello");
        System.out.println(hello);
    }
}
