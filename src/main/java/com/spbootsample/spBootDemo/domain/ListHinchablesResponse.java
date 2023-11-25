package com.spbootsample.spBootDemo.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ListHinchablesResponse {

    List<HinchableDTO> hinchableList;

}
