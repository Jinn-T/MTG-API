package com.example.MTGapiproject.Payloads.requests;

//import lombok.Getter;


import com.example.MTGapiproject.Entities.TextBox;

public class cardCreatePayload {

    // create getter and setters for private values

    private String name;
    private String manaCost;
    private String typeLine;
    private String expansionSymbol;
    private TextBox textBox;
    private String artistInfo;
    private Integer collectorNum;
    private Integer powerTough;
    private String cardBorder;



    // name
    public String getName () { // getter
        return this.name;
    }

    // methods with the keyword void does not return anything - its only setting it
    public void setName () { // setter
        this.name = name;
    }

    // manaCost
    public String getManaCost () {
        return this.manaCost;
    }

    public void setManaCost () {
        this.manaCost = manaCost;
    }

    // typeLine
    public String getTypeLine () {
        return this.typeLine;
    }

    public void setTypeLine () {
        this.typeLine = typeLine;
    }

    // expansionSymbol
    public String getExpansionSymbol () {
        return this.expansionSymbol;
    }

    public void setExpansionSymbol () {
        this.expansionSymbol = expansionSymbol;
    }

    // textBox
    public TextBox getTextBox () {
        return this.textBox;
    }

    public void setTextBox () {
        this.textBox = textBox;
    }

    // artistInfo
    public String getArtistInfo () {
        return this.artistInfo;
    }
    public void setArtistInfo () {
        this.artistInfo = artistInfo;
    }

    // collectorNum
    public Integer getCollectorNum () {
        return this.collectorNum;
    }

    public void setCollectorNum () {
        this.collectorNum = collectorNum;
    }

    // powerTough
    public Integer getPowerTough () {
        return this.powerTough;
    }

    public void setPowerTough () {
        this.powerTough = powerTough;
    }

    // cardBorder
    public String getCardBorder () {
        return this.cardBorder;
    }

    public void setCardBorder () {
        this.cardBorder = cardBorder;
    }
}
