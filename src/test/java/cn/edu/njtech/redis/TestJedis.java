package cn.edu.njtech.redis;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

/**
 * @author tim
 * @date 2022/9/13 2:33 下午
 */
public class TestJedis {

    @Test
    public void test() {
        //1.创建jedis对象
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.select(0);//选择操作的库默认0号库
        jedis.append("name", "tim");
        jedis.close();
    }

}
