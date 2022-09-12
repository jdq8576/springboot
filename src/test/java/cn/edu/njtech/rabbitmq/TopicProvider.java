package cn.edu.njtech.rabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author tim
 * @date 2022/9/12 7:21 下午
 */
@SpringBootTest
public class TopicProvider {
    
    @Autowired
    private RabbitTemplate rabbitTemplate;

    //topic
    @Test
    public void testTopic() {
        rabbitTemplate.convertAndSend("topics", "user.save.findAll", "user.save.findAll 的消息");
    }
}
