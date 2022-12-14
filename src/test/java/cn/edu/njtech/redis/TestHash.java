package cn.edu.njtech.redis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class TestHash {

    private Jedis jedis;

    @Before
    public void before() {
        this.jedis = new Jedis("127.0.0.1", 6379);
    }

    @After
    public void after() {
        jedis.close();
    }

    //测试HASH相关
    @Test
    public void testHash() {
        //hset
        jedis.hset("maps", "name", "zhangsan");
        //hget
        jedis.hget("maps", "name");
        //hgetall
        jedis.hgetAll("mps");
        //hkeys
        jedis.hkeys("maps");
        //hvals
        jedis.hvals("maps");
        //....
    }
}