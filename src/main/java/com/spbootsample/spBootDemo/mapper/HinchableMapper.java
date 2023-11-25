package com.spbootsample.spBootDemo.mapper;

import com.spbootsample.spBootDemo.domain.HinchableDTO;
import com.spbootsample.spBootDemo.model.HinchableEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HinchableMapper {

    HinchableDTO toDto(HinchableEntity source);

    List<HinchableDTO> toDto(List<HinchableEntity> source);
}
