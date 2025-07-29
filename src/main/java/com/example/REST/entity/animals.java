package com.example.REST.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@Entity
@Table(name= "animals")
public class animals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
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
