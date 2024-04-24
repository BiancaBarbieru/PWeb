package com.pweb.fashionswap.service;

import com.pweb.fashionswap.entities.Address;
import com.pweb.fashionswap.entities.User;
import com.pweb.fashionswap.entities.dto.AddressDTO;
import com.pweb.fashionswap.repository.AddressRepository;
import com.pweb.fashionswap.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    private final AddressRepository addressRepository;
    private final UserRepository userRepository;

    public AddressService(AddressRepository addressRepository, UserRepository userRepository){
        this.addressRepository = addressRepository;
        this.userRepository = userRepository;
    }
    public Address addAddress(AddressDTO createAddressRequest){
        //aici adaug adresa la user
        Address address = new Address(createAddressRequest.getStreet(),
                createAddressRequest.getCity(),
                createAddressRequest.getNumber(),
                createAddressRequest.getZipCode());
        address = addressRepository.save(address);
        User user = userRepository.findById(createAddressRequest.getUserId()).orElse(null);
        user.setAddress(address);
        userRepository.save(user);
        return addressRepository.save(address);
    }
    public Optional<Address> getAddressById(Long id) { return addressRepository.findById(id);}

}
