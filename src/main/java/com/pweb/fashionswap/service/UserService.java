package com.pweb.fashionswap.service;

import com.pweb.fashionswap.entities.User;
import com.pweb.fashionswap.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;


    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    public List<User> getAllUsers(){return userRepository.findAll();}

    public void deleteUser(Long id){ userRepository.deleteById(id);}

}
