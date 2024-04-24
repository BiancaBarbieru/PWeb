package com.pweb.fashionswap.repository;

import com.pweb.fashionswap.entities.Order;
import com.pweb.fashionswap.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
