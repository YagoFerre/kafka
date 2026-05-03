package yago.ferreira.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import yago.ferreira.consumer.domain.CustomMessage;

@Slf4j
@Service
public class ConsumerService {
    private static final String TOPIC = "message.topic.sample";

    @KafkaListener(topics = TOPIC, groupId = "sample-consumer-group", containerFactory = "kafkaListenerContainerFactory")
    public void listen(CustomMessage customMessage) {
        log.info("Consumer Listener: {}", customMessage);
    }
}
