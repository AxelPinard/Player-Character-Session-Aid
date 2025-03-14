package src.main.character.model;
import src.main.classes.model.Class;
import src.main.equipment.model.Item;
import src.main.race.model.Races;
import src.main.stats.model.*;

public class Characters {
    private Class Class;
    private Races Race;
    private Item[] items;
    private Ability Strength;
    private Ability Dexterity;
    private Ability Constitution;
    private Ability Intelligence;
    private Ability Wisdom;
    private Ability Charisma;
    private HP health;
    private Size Size;

    public Characters(Class Class, Races Race, Item[] items,
                      Ability Strength, Ability Dexterity, Ability Constitution,
                      Ability Intelligence, Ability Wisdom, Ability Charisma, HP health, Size Size) {
        this.Class = Class;
        this.Race = Race;
        this.items = items;
        this.Strength = Strength;
        this.Dexterity = Dexterity;
        this.Constitution = Constitution;
        this.Intelligence = Intelligence;
        this.Wisdom = Wisdom;
        this.Charisma = Charisma;
        this.health = health;
        this.Size = Size;
    }
}
