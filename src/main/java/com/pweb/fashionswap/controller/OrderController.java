package com.pweb.fashionswap.controller;

import com.pweb.fashionswap.entities.Order;
import com.pweb.fashionswap.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) { this.orderService = orderService;}

    @PostMapping("/orders")
    public Order addOrder(@RequestBody Order order){ return orderService.addOrder(order);}

    @GetMapping("/orders/{id}")
    public Order getOrder(@PathVariable Long id){ return orderService.getOrderById(id).orElse(null);}
}
