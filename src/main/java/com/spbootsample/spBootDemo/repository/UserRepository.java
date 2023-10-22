/**
 * 
 */
package com.spbootsample.spBootDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spbootsample.spBootDemo.model.User;

/**
 * 
 */
public interface UserRepository extends JpaRepository<User, Long> {
    // Puedes agregar métodos personalizados si es necesario
}