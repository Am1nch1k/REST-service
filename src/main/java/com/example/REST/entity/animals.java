package com.example.REST.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
public class animals {
    private String name;
    private String colour;
    private int age;
    private String gender;
    public animals(String name, String colour, int age, String gender){
        this.gender = gender;
        this.colour = colour;
        this.name = name;
        this.age = age;
    }
}
