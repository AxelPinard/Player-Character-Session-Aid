package com.github.AxelPinard.PlayerCharacterSessionAid.stats.model

public class HP {
    int current;
    int max;
    int temp;

    public HP(int current, int max, int temp) {
        this.current = current;
        this.max = max;
        this.temp = temp;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}

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

public class Ability {
    private String name;
    int score;
    int modifier;

    public Ability(String name, int score) {
        this.name = name;
        this.score = score;
        this.modifier = (score - 10) / 2;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int SetScore(int score) {
        this.score = score;
        this.modifier = (score - 10) / 2;
    }

    public int getModifier() {
        return modifier;
    }
}
