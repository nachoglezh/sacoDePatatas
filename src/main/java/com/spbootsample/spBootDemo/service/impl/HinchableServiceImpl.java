package com.spbootsample.spBootDemo.service.impl;

import com.spbootsample.spBootDemo.domain.HinchableDTO;
import com.spbootsample.spBootDemo.mapper.HinchableMapper;
import com.spbootsample.spBootDemo.model.HinchableEntity;
import com.spbootsample.spBootDemo.repository.HinchableRepository;
import com.spbootsample.spBootDemo.service.HinchableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class HinchableServiceImpl implements HinchableService {

    private static final String LOG_PREFIX = "[HINCHABLE SERVICE]";
    @Autowired
    HinchableRepository hinchableRepository;

    @Autowired
    HinchableMapper hinchableMapper;

    @Override
    public List<HinchableDTO> listHinchables() {
        return hinchableMapper.toDto(hinchableRepository.findAll());
    }

    @Override
    public HinchableDTO getHinchable(Long hinchableId) {
        try {
            Optional<HinchableEntity> result = hinchableRepository.findById(hinchableId);

            if (result.isEmpty()) {
                log.error("{} Get Hinchable, mensaje de error: no hay Hinchable existente con el id: {}", LOG_PREFIX, hinchableId);
                throw new Exception("no hay Hinchable existente con el id: " + hinchableId);
            }

            return hinchableMapper.toDto(result.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
