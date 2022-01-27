package com.example.MTGapiproject.Payloads.requests;

public class TestCreatePayload {

    //data user is sending us - getter and setter methods because our variables are private

    private String name;
    private Integer power;

    //Getter & Setter for name
    public String getName () {
        return this.name;
    }

    public void setName () {
        this.name = name;
    }

    //Getter & Setter for power
    public Integer getPower() {
        return this.power;
    }

    public void setPower() {
        this.power = power;
    }

    //Constructor
    public TestCreatePayload () {};

    //Overloading constructor
    public TestCreatePayload (String name, Integer power) {
        this.name = name;
        this.power = power;
    }
}
