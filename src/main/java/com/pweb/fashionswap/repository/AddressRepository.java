package com.pweb.fashionswap.repository;

import com.pweb.fashionswap.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
