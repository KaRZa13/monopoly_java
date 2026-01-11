package Properties.types;

import Properties.Property;

public class Station extends Property {

    public Station(String name, int price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Gare : " + name + " - " + price + "€");
    }
}
