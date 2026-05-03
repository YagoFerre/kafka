package yago.ferreira.producer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import yago.ferreira.producer.domain.CustomMessage;

@Slf4j
@Service
public class MessageService {
    private static final String TOPIC = "message.topic.sample";

    private final KafkaTemplate<String, CustomMessage> kafkaTemplate;

    public MessageService(KafkaTemplate<String, CustomMessage> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(CustomMessage message) {
        kafkaTemplate.send(TOPIC, message);
        log.info("Message sent to topic {}", TOPIC);
    }
}
