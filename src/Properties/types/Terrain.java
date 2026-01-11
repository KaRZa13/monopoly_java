package Properties.types;

import Properties.Property;

public class Terrain extends Property {

    public Terrain(String name, int price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Terrain : " + name + " - " + price + "€");
    }
}

