package com.example.MTGapiproject.Entities;

public class magicCard {

    // State of an object
    String name;
    String manaCost;
    String typeLine;
    String expansionSymbol;
    TextBox textBox;
    String artistInfo;
    Integer collectorNum;
    Integer powerTough;
    // If there are only 5 card borders to choose from we can use enum?
    String cardBorder;

    // Creating a constructor which is an instance of a class, defining what the object looks like
    public magicCard(String name, String manaCost, String typeLine, String expansionSymbol, TextBox textBox, String artistInfo, Integer collectorNum, Integer powerTough, String cardBorder)
    {
        this.name = name;
        this.manaCost = manaCost;
        this.typeLine = typeLine;
        this.expansionSymbol = expansionSymbol;
        this.textBox = textBox;
        this.artistInfo = artistInfo;
        this.collectorNum = collectorNum;
        this.powerTough = powerTough;
        this.cardBorder = cardBorder;
    }


}
