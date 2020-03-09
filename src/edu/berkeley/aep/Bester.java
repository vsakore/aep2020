package edu.berkeley.aep;

public class Bester {
    private final Bestable[] quantities;

    public Bester(Bestable... quantities) {
        this.quantities = quantities;
    }

    public Bestable best() {
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
