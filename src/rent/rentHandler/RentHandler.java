package rent.rentHandler;

import rent.RentContext;

public abstract class RentHandler {
    private RentHandler next;

    public RentHandler linkWith(RentHandler next) {
        this.next = next;
        return next;
    }

    public final int calculateRent(RentContext ctx) {
        Integer rent = tryCalculateRent(ctx);
        if (rent != null) return rent;
        if (next == null) throw new IllegalStateException("Aucun maillon n'a pu calculer le loyer.");
        return next.calculateRent(ctx);
    }

    protected abstract  Integer tryCalculateRent(RentContext ctx);
}
