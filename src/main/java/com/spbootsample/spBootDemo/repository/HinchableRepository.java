package com.spbootsample.spBootDemo.repository;

import com.spbootsample.spBootDemo.model.HinchableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HinchableRepository extends JpaRepository<HinchableEntity, Long> {
}
