package cn.edu.njtech.redis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Set;

public class TestSet {

    private Jedis jedis;

    @Before
    public void before() {
        this.jedis = new Jedis("127.0.0.1", 6379);
    }

    @After
    public void after() {
        jedis.close();
    }

    //测试SET相关
    @Test
    public void testSet() {

        //sadd
        jedis.sadd("names", "zhangsan", "lisi");

        //smembers
        Set<String> names = jedis.smembers("names");
        names.forEach(System.out::println);

        //sismember
        jedis.sismember("names", "xiaochen");
    }
}