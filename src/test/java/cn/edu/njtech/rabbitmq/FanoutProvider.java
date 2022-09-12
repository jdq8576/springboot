package cn.edu.njtech.rabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author tim
 * @date 2022/9/12 7:13 下午
 */
@SpringBootTest
public class FanoutProvider {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testFanout() {
        rabbitTemplate.convertAndSend("logs", "", "这是广播日志");
    }
}
