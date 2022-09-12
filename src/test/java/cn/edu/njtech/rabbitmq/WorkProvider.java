package cn.edu.njtech.rabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author tim
 * @date 2022/9/12 7:10 下午
 */
@SpringBootTest
public class WorkProvider {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testWork() {
        for (int i = 0; i < 10; i++) {
            rabbitTemplate.convertAndSend("work", "hello work!");
        }
    }
}
