package com.spbootsample.spBootDemo.controller.facade;

import com.spbootsample.spBootDemo.domain.GetHinchableResponseDTO;
import com.spbootsample.spBootDemo.domain.ListHinchablesResponseDTO;

public interface HinchableFacade {

    ListHinchablesResponseDTO listHinchables();

    GetHinchableResponseDTO getHinchable(Long hinchableId);
}
