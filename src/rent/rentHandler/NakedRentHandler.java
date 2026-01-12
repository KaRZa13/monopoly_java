package rent.rentHandler;

import rent.RentContext;

public final class NakedRentHandler extends RentHandler {
    @Override
    protected Integer tryCalculateRent(RentContext ctx) {
        return ctx.getProperty().getNakedRent();
    }
}
