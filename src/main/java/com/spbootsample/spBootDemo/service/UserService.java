/**
 *
 */
package com.spbootsample.spBootDemo.service;

import com.spbootsample.spBootDemo.model.UserEntity;
import com.spbootsample.spBootDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class UserService {

    /**
     *
     */
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Métodos de servicio para realizar operaciones específicas de la aplicación
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    public UserEntity getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}