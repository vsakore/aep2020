package edu.berkeley.aep;

import org.junit.Test;

import static edu.berkeley.aep.Unit.*;
import static org.junit.Assert.assertEquals;

public class BesterTest {
    @Test
    public void shouldChooseBestQuantity() {
        assertEquals(new Quantity(10, FEET), new Bester(new Quantity(1, YARD), new Quantity(2, YARD), new Quantity(10, FEET)).best());
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowExceptionIfPassedEmptyArray() {
        assertEquals(null, new Bester().best());
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowExceptionIfPassedNull() {
        assertEquals(null, new Bester(null, null).best());
    }

    @Test
    public void shouldChooseBestProbability() {
        assertEquals(new Chance(0.5), new Bester(new Chance(0.2), new Chance(0.5)).best());
    }
}
