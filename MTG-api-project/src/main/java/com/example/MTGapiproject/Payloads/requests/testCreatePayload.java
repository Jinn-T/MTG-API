package com.example.MTGapiproject.Payloads.requests;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class testCreatePayload {

    //data user is sending us - getter and setter methods because our variables are private

    @Getter
    @Setter
    @NotBlank
    private String name;

    @Getter @Setter @NotNull
    private Integer power;

    //Constructor
    public testCreatePayload() {}

    //Overloading constructor
    public testCreatePayload(String name, Integer power) {
        this.name = name;
        this.power = power;
    }
}
