package terrains.terrainTypes;

import terrains.Terrain;

public class Station extends Terrain {

    public Station(String name, int price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Gare : " + name + " - " + price + "€");
    }
}
