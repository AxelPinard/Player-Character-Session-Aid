package com.github.AxelPinard.PlayerCharacterSessionAid.stats.model

public class Ability {
    private String name;
    private int score;
    private int modifier;

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
