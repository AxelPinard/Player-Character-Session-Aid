package src.main.race.model;
import src.main.stats.model.Size;

public class Race {
    private String raceName;
    private Size SizeMod;
    private int speed;

    public Race() {}

    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}

    public String getRaceName() {return raceName;}
    public void setRaceName(String raceName) {this.raceName = raceName;}

    public void setSizeMod(Size sizeMod) {SizeMod = sizeMod;}
    public Size getSizeMod() {return SizeMod;}
}
