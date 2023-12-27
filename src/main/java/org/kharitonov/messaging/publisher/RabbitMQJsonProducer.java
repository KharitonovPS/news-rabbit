package org.kharitonov.messaging.publisher;

import lombok.extern.slf4j.Slf4j;
import org.kharitonov.messaging.dto.News;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RabbitMQJsonProducer {

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.json.key}")
    private String routingJsonKey;

    private final RabbitTemplate rabbitTemplate;

    public RabbitMQJsonProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendJsonMessage(News news) {
        log.info("Message (json) sent -> {}.", news.toString());
        rabbitTemplate.convertAndSend(exchange, routingJsonKey, news);
    }
}
