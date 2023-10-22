/**
 * 
 */
package com.spbootsample.spBootDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spbootsample.spBootDemo.model.User;
import com.spbootsample.spBootDemo.repository.UserRepository;

import lombok.Getter;
import lombok.Setter;

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
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}