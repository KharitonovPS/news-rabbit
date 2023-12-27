package org.kharitonov.messaging.controller;


import org.kharitonov.messaging.dto.News;
import org.kharitonov.messaging.publisher.RabbitMQJsonProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class MessageJsonController {

    private final RabbitMQJsonProducer jsonProducer;

    public MessageJsonController(RabbitMQJsonProducer jsonProducer) {
        this.jsonProducer = jsonProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody News news) {
        jsonProducer.sendJsonMessage(news);
        return ResponseEntity.ok("Json message sent to RabbitMQ...");
    }
}
