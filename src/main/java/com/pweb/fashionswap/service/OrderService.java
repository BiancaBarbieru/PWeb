package com.pweb.fashionswap.service;

import com.pweb.fashionswap.entities.Order;
import com.pweb.fashionswap.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public Order addOrder(Order order){ return orderRepository.save(order);}
    public Optional<Order> getOrderById(Long id) { return orderRepository.findById(id);}
}
