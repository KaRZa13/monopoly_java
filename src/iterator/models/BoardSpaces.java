package iterator.models;

public class BoardSpaces {
    private final int id;
    private final String name;

    public BoardSpaces(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Board Space ID: " + id + ", Name: " + name);
    }
}
