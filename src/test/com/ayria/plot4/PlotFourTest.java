package com.ayria.plot4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlotFourTest {

    @Test
    void play() {
    }

    @Test
    void getDimention() {

    }

    @Test
    void validateRow() {
        assertEquals(true, PlotFour.validateColumn(5));
        assertEquals(true, PlotFour.validateColumn(9));
        assertEquals(false, PlotFour.validateColumn(4));
        assertEquals(false, PlotFour.validateColumn(10));
    }

    @Test
    void validateColumn() {
        assertEquals(true, PlotFour.validateColumn(5));
        assertEquals(true, PlotFour.validateColumn(9));
        assertEquals(false, PlotFour.validateColumn(4));
        assertEquals(false, PlotFour.validateColumn(10));
    }

}
