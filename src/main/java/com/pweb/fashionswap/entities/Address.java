package com.pweb.fashionswap.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    @NotNull(message = "Street should not be null!")
    private String street;

    @NotNull(message = "City should not be null!")
    private String city;

    private String number;

    private String zipCode;

    public Address(String street, String city, String number, String zipCode) {
        this.street = street;
        this.city = city;
        this.number = number;
        this.zipCode = zipCode;
    }
}
