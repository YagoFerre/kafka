package yago.ferreira.producer.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import yago.ferreira.producer.domain.CustomMessage;

@Service
public class MessageService {

    private final KafkaTemplate<String, CustomMessage> kafkaTemplate;

    public MessageService(KafkaTemplate<String, CustomMessage> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(CustomMessage message) {
        kafkaTemplate.send("message.topic.sample", message);
    }
}
