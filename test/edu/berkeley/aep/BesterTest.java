package edu.berkeley.aep;

import org.junit.Test;

import static edu.berkeley.aep.Unit.*;
import static org.junit.Assert.assertEquals;

public class BesterTest {
    @Test
    public void shouldChooseBestQuantity() {
        var bester = new Bester(new Quantity(1, YARD), new Quantity(2, YARD), new Quantity(10, FEET));
        assertEquals(new Quantity(10, FEET), bester.best());
    }

    @Test
    public void shouldChooseBestChance() {
        var bester = new Bester<>(new Chance(0.5), new Chance(0.25));
        assertEquals(new Chance(0.5), bester.best());
    }

}
