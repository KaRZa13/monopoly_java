package rent.rentHandler;

import rent.RentContext;

public final class RentMortgageHandler extends RentHandler {
    @Override
    protected Integer tryCalculateRent(RentContext ctx) {
        if (ctx.getProperty().isMortgaged()) return 0;
        return null;
    }
}
