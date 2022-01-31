package com.example.MTGapiproject.Payloads.requests;

public class textBoxCreatePayload {

    private String abilities;
    private String flavourText;


    // abilities
    public String getAbilities()
    {
        return this.abilities;
    }

    public void setAbilities ()
    {
        this.abilities = abilities;
    }


    // flavourText
    public String getFlavourText()
    {
        return this.flavourText;
    }

    public void setFlavourText ()
    {
        this.flavourText = flavourText;
    }
}
