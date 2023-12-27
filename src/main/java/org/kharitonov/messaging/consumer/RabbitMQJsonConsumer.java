package org.kharitonov.messaging.consumer;

import lombok.extern.slf4j.Slf4j;
import org.kharitonov.messaging.dto.News;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RabbitMQJsonConsumer {

    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    public void consume(News news) {
        log.info("Message (json) received -> {}", news.toString());
    }
}
