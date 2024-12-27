package interview.event.interview.service;

import interview.event.interview.dto.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImple implements OrderService
{
    final KafkaService kafkaService;

    @Autowired
    public OrderServiceImple(KafkaService kafkaService)
    {
        this.kafkaService = kafkaService;
    }

    @Override
    public Order CreateOrder(String customerId, String details)
    {
        return null;
    }

    // Assume orders passed with details
    @Override
    public void pubDetails(Order order)
    {
        kafkaService.sendEvent(order);
    }
}
