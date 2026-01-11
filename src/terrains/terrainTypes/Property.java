package terrains.terrainTypes;

import terrains.Terrain;

public class Property extends Terrain {

    public Property(String name, int price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Property : " + name + " - " + price + "€");
    }
}

