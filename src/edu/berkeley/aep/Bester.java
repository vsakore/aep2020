package edu.berkeley.aep;

public class Bester<T extends Bestable> {
    private final T[] quantities;

    public Bester(T... quantities) {
        this.quantities = quantities;
    }

    public T best() {
        var champion = quantities[0];
        for (T challenger : quantities) {
            if (challenger.betterThan(champion)) {
                champion = challenger;
            }
        }
        return champion;
    }
}
