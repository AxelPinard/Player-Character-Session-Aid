package src.main.stats.model;

public class HP {
    private int current;
    private int max;
    private int temp;

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
