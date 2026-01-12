package rent;

import dao.Player;
import terrains.terrainTypes.Property;

public class RentContext {
    private final Player player;
    private final Property property;

    public RentContext(Player player, Property property) {
        this.player = player;
        this.property = property;
    }

    public Player getPlayer() {
        return player;
    }

    public Property getProperty() {
        return property;
    }
}
