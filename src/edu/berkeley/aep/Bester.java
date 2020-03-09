package edu.berkeley.aep;

public class Bester {
    private final Quantity[] quantities;

    public Bester(Quantity... quantities) {
        this.quantities = quantities;
    }

    public Quantity best() {
        if (quantities == null || quantities.length == 0) throw new NullPointerException("Must pass at least one quantity!");
        var champion = quantities[0];
        for (var challenger : quantities) {
            if (challenger.betterThan(champion)) {
                champion = challenger;
            }
        }
        return champion;
    }
}
