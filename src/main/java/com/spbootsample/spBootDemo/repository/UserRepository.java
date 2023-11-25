/**
 *
 */
package com.spbootsample.spBootDemo.repository;

import com.spbootsample.spBootDemo.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // Puedes agregar métodos personalizados si es necesario
}