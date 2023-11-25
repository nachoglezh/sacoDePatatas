package com.spbootsample.spBootDemo.controller.facade.impl;

import com.spbootsample.spBootDemo.controller.facade.HinchableFacade;
import com.spbootsample.spBootDemo.domain.GetHinchableResponse;
import com.spbootsample.spBootDemo.domain.ListHinchablesResponse;
import com.spbootsample.spBootDemo.service.HinchableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HinchableFacadeImpl implements HinchableFacade {

    @Autowired
    HinchableService hinchableService;

    @Override
    public ListHinchablesResponse listHinchables() {
        return ListHinchablesResponse.builder().hinchableList(hinchableService.listHinchables()).build();
    }

    @Override
    public GetHinchableResponse getHinchable(Long hinchableId) {
        return GetHinchableResponse.builder().hinchableDTO(hinchableService.getHinchable(hinchableId)).build();
    }
}
