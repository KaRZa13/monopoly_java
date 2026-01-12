package rent.rentHandler;

import rent.RentContext;
import terrains.terrainTypes.Property;

public final class RentSamePlayerHandler extends RentHandler {
    @Override
    protected Integer tryCalculateRent(RentContext ctx) {
        Property p = ctx.getProperty();
        if (p.getOwner() != null && p.getOwner().equals(ctx.getPlayer())) {
            return 0;
        }
        return 0;
    }
}
