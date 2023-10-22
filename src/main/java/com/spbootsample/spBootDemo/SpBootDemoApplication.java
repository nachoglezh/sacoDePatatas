package com.spbootsample.spBootDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spbootsample.spBootDemo.model.User;
import com.spbootsample.spBootDemo.service.UserService;

@SpringBootApplication
@RestController
public class SpBootDemoApplication {
	@Autowired
	UserService userService;
    public static void main(String[] args) {
      SpringApplication.run(SpBootDemoApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }
    
    @GetMapping("/connectionTest_0")
    public String queryDatabase() {
        List<User> users = userService.getAllUsers(); // Cambia esta consulta según tus necesidades

        // Construye la respuesta a partir de los resultados de la consulta
        StringBuilder response = new StringBuilder("Usuarios en la base de datos:\n");
        for (User user : users) {
            response.append(user.toString()).append(")\n");
        }

        return response.toString();
    }
}