package com.pweb.fashionswap.entities.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {
    private String street;
    private String city;
    private String number;
    private String zipCode;
    private Long userId;
}
