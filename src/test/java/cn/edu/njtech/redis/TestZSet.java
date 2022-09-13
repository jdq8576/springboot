package cn.edu.njtech.redis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class TestZSet {

    private Jedis jedis;

    @Before
    public void before() {
        this.jedis = new Jedis("127.0.0.1", 6379);
    }

    @After
    public void after() {
        jedis.close();
    }

    //测试ZSET相关
    @Test
    public void testZset() {

        //zadd
        jedis.zadd("namess", 10, "张三");

        //zrange
        jedis.zrange("namess", 0, -1);

        //zcard
        jedis.zcard("namess");

        //zrangeByScore
        jedis.zrangeByScore("namess", "0", "100", 0, 5);

        
    }
}