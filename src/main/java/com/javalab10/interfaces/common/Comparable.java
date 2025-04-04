package com.javalab10.interfaces.common;

import java.util.Arrays;

/**
 * Interface for objects that can be compared based on a specific value.
 * Classes implementing this interface must define the method getComparableValue().
 * @param <T> the type of the comparable value
 */
public interface Comparable<T extends java.lang.Comparable<T>> {
    /**
     * Returns the value used for comparison.
     * @return the comparable value
     */
    T getComparableValue();

    /**
     * A utility method that finds the maximum object from an array of Comparable objects.
     * This method compares objects based on their comparable values.
     * 
     * @param items Array of objects to compare (must not be null or empty)
     * @param <U> The type of value used for comparison
     * @return The object with the highest comparable value
     * @throws IllegalArgumentException if the array is null or empty
     * @throws IllegalStateException if unable to find maximum value
     */
    static <U extends java.lang.Comparable<U>> Comparable<U> max(Comparable<U>[] items) {
        // Check for null or empty array
        if (items == null || items.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        // Use Java streams to find the maximum value
        // Compare objects by their comparable values using the compareTo method
        return Arrays.stream(items)
                    .max((a, b) -> a.getComparableValue().compareTo(b.getComparableValue()))
                    .orElseThrow(() -> new IllegalStateException("Unable to find maximum value"));
    }
}
