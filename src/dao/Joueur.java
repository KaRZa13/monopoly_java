package dao;

public class Joueur {

    private String name;
    private int cash;

    public Joueur(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCash() {
        return this.cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
    @Override
    public String toString() {
        return "Name=" + name +
                ",cash=" + cash;
    }
}
