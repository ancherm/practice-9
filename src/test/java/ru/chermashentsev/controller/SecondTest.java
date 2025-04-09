package ru.chermashentsev.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondTest {

    @Test
    public void testDifferentNumbers_fail_noEquals() {
        int actual = 3;
        assertNotEquals(2, actual);
    }
}
