package ru.chermashentsev.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainControllerTest {


    @Test
    public void testEqualsTwoNumbers_success() {
        int expected = 2;

        assertEquals(expected, 2);
    }
}