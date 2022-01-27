package com.example.MTGapiproject.Entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TestEntity {

    //This allows database to automatically generate id
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    String name;
    Integer power;

    public TestEntity(String name, Integer power) {
        this.name = name;
        this.power = power;
    }

    // empty constructor - overloading, different alternative that doesnt take parameters
    public TestEntity () {};

}
