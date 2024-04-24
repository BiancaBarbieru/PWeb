package com.pweb.fashionswap.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    private Date orderDate;
    private Date shipmentDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    private Double moneyAmount;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


}
