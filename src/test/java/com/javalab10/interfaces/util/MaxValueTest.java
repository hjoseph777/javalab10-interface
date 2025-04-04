package com.javalab10.interfaces.util;

import com.javalab10.interfaces.model.Person;
import com.javalab10.interfaces.model.Cow;
import com.javalab10.interfaces.common.Comparable;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxValueTest {
    @Test
    public void testMax() {
        Person person = new Person("TestPerson", 30); // Fix constructor usage
        Cow cow = new Cow("TestCow", 400.0); // Fix constructor usage

        @SuppressWarnings("unchecked")
        Comparable<Double>[] comparables = new Comparable[] { person, cow }; // Fix array creation
        Comparable<Double> max = MaxValue.max(comparables); // Fix method usage
        assertEquals(cow, max); // Ensure correct comparison
    }
}
