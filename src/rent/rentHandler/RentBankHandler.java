package rent.rentHandler;

import dao.Player;
import rent.RentContext;
import terrains.terrainTypes.Property;

public final class RentBankHandler extends RentHandler  {
    private final Player bank;

    public RentBankHandler(Player bank) {
        this.bank = bank;
    }

    @Override
    protected Integer tryCalculateRent(RentContext ctx) {
        Property p = ctx.getProperty();
        if (p.getOwner() == null) return 0;
        if (p.getOwner().equals(bank)) return 0;
        return null;
    }
}
