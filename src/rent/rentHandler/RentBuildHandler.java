package rent.rentHandler;

import rent.RentContext;
import terrains.terrainTypes.Property;

public final class RentBuildHandler extends RentHandler {
    @Override
    protected Integer tryCalculateRent(RentContext ctx) {
        Property p = ctx.getProperty();
        int houses = p.getHouseCount();
        if (houses <= 0) return null;

        int[] gridRent = p.getHouseRents();
        if(houses > gridRent.length) throw new IllegalArgumentException("Nb de maisons invalide : " + houses);

        return gridRent[houses - 1];
    }
}
