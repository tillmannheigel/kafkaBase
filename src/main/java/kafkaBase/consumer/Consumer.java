package kafkaBase.consumer;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Consumer extends KafkaConsumer {
    public Consumer(Map configs) {
        super(configs);
    }
}
