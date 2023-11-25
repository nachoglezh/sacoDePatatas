package com.spbootsample.spBootDemo.controller.facade.impl;

import com.spbootsample.spBootDemo.controller.facade.HinchableFacade;
import com.spbootsample.spBootDemo.domain.GetHinchableResponseDTO;
import com.spbootsample.spBootDemo.domain.ListHinchablesResponseDTO;
import com.spbootsample.spBootDemo.service.HinchableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HinchableFacadeImpl implements HinchableFacade {

    @Autowired
    HinchableService hinchableService;

    @Override
    public ListHinchablesResponseDTO listHinchables() {
        return ListHinchablesResponseDTO.builder().hinchableList(hinchableService.listHinchables()).build();
    }

    @Override
    public GetHinchableResponseDTO getHinchable(Long hinchableId) {
        return GetHinchableResponseDTO.builder().hinchableDTO(hinchableService.getHinchable(hinchableId)).build();
    }
}
