package com.javalab10.interfaces.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class CowTest {
    @Test
    public void testGetComparableValue() {
        Cow cow = new Cow("TestCow", 500.5); // Fix constructor usage
        assertEquals(Double.valueOf(500.5), cow.getComparableValue()); // Fix ambiguous assertEquals
    }
}
