package terrains.terrainTypes;

import terrains.Terrain;
public class Company extends Terrain {

    public Company(String name, int price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Gare : " + name + " - " + price + "€");
    }
}


