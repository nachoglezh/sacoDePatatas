package com.spbootsample.spBootDemo.service;

import com.spbootsample.spBootDemo.domain.HinchableDTO;

import java.util.List;

public interface HinchableService {

    List<HinchableDTO> listHinchables();

    HinchableDTO getHinchable(Long hinchableId);
}
