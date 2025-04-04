package com.javalab10.interfaces.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testGetComparableValue() {
        Person person = new Person("TestName", 25); // Fix constructor usage
        assertEquals(Double.valueOf(25), person.getComparableValue()); // Fix ambiguous assertEquals
    }
}
