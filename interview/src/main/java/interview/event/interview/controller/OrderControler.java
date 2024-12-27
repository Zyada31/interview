package interview.event.interview.controller;

import interview.event.interview.service.OrderServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderControler
{
    private final OrderServiceImple orderServiceImple;

    @Autowired
    public OrderControler(OrderServiceImple orderServiceImple)
    {
        this.orderServiceImple = orderServiceImple;
    }

    @PostMapping
    public ResponseEntity createOrder()
    {
        return null;
    }
}
