package com.spbootsample.spBootDemo.controller;

import com.spbootsample.spBootDemo.constant.Urls;
import com.spbootsample.spBootDemo.controller.facade.HinchableFacade;
import com.spbootsample.spBootDemo.domain.GetHinchableResponseDTO;
import com.spbootsample.spBootDemo.domain.ListHinchablesResponseDTO;
import com.spbootsample.spBootDemo.model.UserEntity;
import com.spbootsample.spBootDemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(Urls.HINCHABLE_REST_CONTROLLER)
public class HinchableController {

    private static final String LOG_PREFIX = "[HINCHABLE CONTROLLER]";

    @Autowired
    HinchableFacade hinchableFacade;

    @Autowired
    UserService userService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ListHinchablesResponseDTO listHinchables() {
        log.info("{} List Hinchables operacion", LOG_PREFIX);
        return hinchableFacade.listHinchables();
    }

    @GetMapping(path = Urls.GET_HINCHABLE, produces = MediaType.APPLICATION_JSON_VALUE)
    public GetHinchableResponseDTO getHinchable(@PathVariable("id") Long hinchableId) {
        log.info("{} Get Hinchables operacion con id: {}", LOG_PREFIX, hinchableId);
        return hinchableFacade.getHinchable(hinchableId);
    }

    @GetMapping("/connectionTest_0")
    public String queryDatabase() {
        List<UserEntity> users = userService.getAllUsers(); // Cambia esta consulta según tus necesidades

        // Construye la respuesta a partir de los resultados de la consulta
        StringBuilder response = new StringBuilder("Usuarios en la base de datos:\n");
        for (UserEntity user : users) {
            response.append(user.toString()).append(")\n");
        }

        return response.toString();
    }
}
