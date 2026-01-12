package dao;

import java.util.Objects;

public final class Player {

    private String name;
    private int cash;

    public Player(String name, int cash) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player player)) return false;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Name=" + name +
                ",cash=" + cash;
    }
}
