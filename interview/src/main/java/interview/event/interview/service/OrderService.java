package interview.event.interview.service;

import interview.event.interview.dto.Order;

public interface OrderService
{
    Order CreateOrder(String customerId, String details);
    void pubDetails(Order order);
}
