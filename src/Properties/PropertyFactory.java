package Properties;

public class PropertyFactory {

    public static Property createProperty(String type, String name, int price) {

        return switch (type.toLowerCase()) {
            case "terrain" -> new Properties.types.Terrain(name, price);
            case "station" -> new Properties.types.Station(name, price);
            case "company" -> new Properties.types.Company(name, price);
            default -> throw new IllegalArgumentException("Unknown property type: " + type);
        };
    }
}
