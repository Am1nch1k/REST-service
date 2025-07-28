package com.example.REST.controller;

import com.example.REST.entity.animals;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("api/controller")
    public String firstController(){
        return "OK - 200";
    }
    @GetMapping("api/cat")
    public String getCats(){
        animals animal= new animals("Barsik", "Orange", 14, "Man_Cats");
        String jsonData = null;
        try {
            jsonData = objectMapper.writeValueAsString(animal);

        } catch (JsonProcessingException e) {
            System.out.printf("Котика не получилось создать( ");
        }
        return jsonData;
    }
}
