package com.ayria.plot4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void main() {
    }

    @Test
    void getDimention() {

    }

    @Test
    void validateRow() {
        assertEquals(true, Main.validateColumn(5));
        assertEquals(true, Main.validateColumn(9));
        assertEquals(false, Main.validateColumn(4));
        assertEquals(false, Main.validateColumn(10));
    }

    @Test
    void validateColumn() {
        assertEquals(true, Main.validateColumn(5));
        assertEquals(true, Main.validateColumn(9));
        assertEquals(false, Main.validateColumn(4));
        assertEquals(false, Main.validateColumn(10));
    }

}