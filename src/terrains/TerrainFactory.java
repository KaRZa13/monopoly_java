package terrains;

public class TerrainFactory {

    public static Terrain createProperty(String type, String name, int price) {

        return switch (type.toLowerCase()) {
            case "property" -> new terrains.terrainTypes.Property(name, price);
            case "station" -> new terrains.terrainTypes.Station(name, price);
            case "company" -> new terrains.terrainTypes.Company(name, price);
            default -> throw new IllegalArgumentException("Unknown property type: " + type);
        };
    }
}
