package interview.event.interview.service;

import interview.event.interview.dto.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaService
{
    private final KafkaTemplate<String, Order> kafkaTemplate;

    @Autowired
    public KafkaService(KafkaTemplate<String, Order> kafkaTemplate)
    {
        this.kafkaTemplate = kafkaTemplate;
    }

    // send events to order-events topic
    public void sendEvent(Order order)
    {
        kafkaTemplate.send("Order-events", order);
    }

}
