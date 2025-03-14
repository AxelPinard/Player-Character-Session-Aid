package com.github.AxelPinard.PlayerCharacterSessionAid.stats.model

public class Size {
    private String name;
    private int acModifier;

    public Size(String name, int acModifier) {
        this.name = name;
        this.acModifier = acModifier;
    }

    public String getName() {
        return name;
    }

    public int getAcModifier() {
        return acModifier;
    }
}
