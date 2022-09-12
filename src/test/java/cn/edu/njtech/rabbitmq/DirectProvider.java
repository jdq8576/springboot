package cn.edu.njtech.rabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author tim
 * @date 2022/9/12 7:26 下午
 */
@SpringBootTest
public class DirectProvider {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testDirect() {
        rabbitTemplate.convertAndSend("directs", "error", "error 的日志信息");
    }
}
