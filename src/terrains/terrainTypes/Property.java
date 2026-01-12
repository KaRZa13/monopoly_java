package terrains.terrainTypes;

import dao.Player;
import terrains.Terrain;

import java.util.Arrays;

public class Property extends Terrain {
    private Player owner;
    private boolean isMortgaged;
    private int houseCount;
    private boolean hasHotel;

    private final int nakedRent;
    private final int[] houseRents;
    private final int hotelRent;

    public Property(String name, int price, int nakedRent, int[] houseRents, int hotelRent) {
        super(name, price);
        if (nakedRent < 0) throw new IllegalArgumentException("nakedRent < 0");
        if (houseRents == null) throw new IllegalArgumentException("houseRents == null");
        this.nakedRent = nakedRent;
        this.houseRents = Arrays.copyOf(houseRents, houseRents.length);
        this.hotelRent = hotelRent;
        this.houseCount = 0;
        this.hasHotel = false;
        this.isMortgaged = false;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public void setMortgaged(boolean mortgaged) {
        this.isMortgaged = mortgaged;
    }

    public boolean isMortgaged() {
        return isMortgaged;
    }

    public int getHouseCount() {
        return houseCount;
    }

    public void setHouseCount(int houseCount) {
        if (houseCount < 0) throw new IllegalArgumentException("houseCount < 0");
        this.houseCount = houseCount;
    }

    public int getNakedRent() {
        return nakedRent;
    }

    public int[] getHouseRents() {
        return Arrays.copyOf(houseRents, houseRents.length);
    }

    @Override
    public void displayInfo() {
        System.out.println(
                "Property{name=" + name +
                        ", price=" + price +
                        ", owner=" + (owner == null ? "BANK" : owner) +
                        ", mortgaged=" + isMortgaged +
                        ", houseCount=" + houseCount +
                        ", nakedRent=" + nakedRent +
                        "}"
        );
    }
}

