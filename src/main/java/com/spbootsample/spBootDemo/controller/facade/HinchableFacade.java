package com.spbootsample.spBootDemo.controller.facade;

import com.spbootsample.spBootDemo.domain.GetHinchableResponse;
import com.spbootsample.spBootDemo.domain.ListHinchablesResponse;

public interface HinchableFacade {

    ListHinchablesResponse listHinchables();

    GetHinchableResponse getHinchable(Long hinchableId);
}
