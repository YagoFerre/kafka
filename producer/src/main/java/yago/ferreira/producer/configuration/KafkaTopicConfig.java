package yago.ferreira.producer.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    private static final String TOPIC = "message.topic.sample";

    @Bean
    public NewTopic topicoEstudo() {
        return TopicBuilder.name(TOPIC)
                .partitions(1)
                .replicas(1)
                .build();
    }
}
