package Properties.types;

import Properties.Property;
public class Company extends Property {

    public Company(String name, int price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Gare : " + name + " - " + price + "€");
    }
}


