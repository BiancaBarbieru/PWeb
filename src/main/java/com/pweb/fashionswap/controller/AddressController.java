package com.pweb.fashionswap.controller;

import com.pweb.fashionswap.entities.Address;
import com.pweb.fashionswap.entities.dto.AddressDTO;
import com.pweb.fashionswap.service.AddressService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.*;

@RestController
@SecurityRequirement(name = "bearerAuth")
public class AddressController {
    private AddressService addressService;
    public AddressController (AddressService addressService){this.addressService = addressService;}
    @PostMapping("/addresses")
    public Address addAddress(@RequestBody AddressDTO address){ return addressService.addAddress(address);}

    @GetMapping("/addresses/{id}")
    public Address getAddress(@PathVariable Long id){ return addressService.getAddressById(id).orElse(null);}

}
