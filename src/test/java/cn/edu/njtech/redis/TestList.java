package cn.edu.njtech.redis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.ListPosition;

import java.util.List;

public class TestList {

    private Jedis jedis;

    @Before
    public void before() {
        this.jedis = new Jedis("127.0.0.1", 6379);
    }

    @After
    public void after() {
        jedis.close();
    }

    //测试List相关
    @Test
    public void testList() {

        //lpush
        jedis.lpush("names1", "张三", "王五", "赵六", "win7");

        //rpush
        jedis.rpush("names1", "xiaomingming");

        //lrange
        List<String> names1 = jedis.lrange("names1", 0, -1);
        names1.forEach(name -> System.out.println("name = " + name));

        //lpop rpop
        String names11 = jedis.lpop("names1");
        System.out.println(names11);
        names11 = jedis.rpop("names1");

        //linsert
        jedis.linsert("lists", ListPosition.BEFORE, "xiaohei", "xiaobai");

    }
}