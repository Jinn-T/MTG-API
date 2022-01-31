package com.example.MTGapiproject.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity(name = "test_entity") //
public class testEntity {

    //This allows database to automatically generate id
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Getter
    @Setter
    @NotBlank
    String name;

    @Getter @Setter @NotNull
    Integer power;

    public testEntity(String name, Integer power) {
        this.name = name;
        this.power = power;
    }

    // empty constructor - overloading, different alternative that doesn't take parameters
    public testEntity() {};

}
