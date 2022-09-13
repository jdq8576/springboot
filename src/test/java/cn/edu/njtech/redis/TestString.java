package cn.edu.njtech.redis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;

public class TestString {

    private Jedis jedis;

    @Before
    public void before() {
        this.jedis = new Jedis("127.0.0.1", 6379);
    }

    @After
    public void after() {
        jedis.close();
    }

    //测试String相关
    @Test
    public void testString() {
        //set
        jedis.set("name", "Tim");
        //get
        String s = jedis.get("name");
        System.out.println(s);
        //mset
        jedis.mset("content", "好人", "address", "海淀区");
        //mget
        List<String> mget = jedis.mget("name", "content", "address");
        mget.forEach(v -> System.out.println("v = " + v));
        //getset
        String set = jedis.getSet("name", "小明");
        System.out.println(set);
    }
}