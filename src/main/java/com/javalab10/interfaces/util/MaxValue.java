 package com.javalab10.interfaces.util;

 import com.javalab10.interfaces.common.Comparable;

public class MaxValue {
     /**
     * Finds the maximum value among an array of Comparable objects.
     * @param <T> the type of the comparable value
     * @param comps array of Comparable objects
     * @return the object with the maximum value
     */
    public static <T extends java.lang.Comparable<T>> Comparable<T> max(Comparable<T>[] comps) {
        if (comps == null || comps.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }
        Comparable<T> max = comps[0];
        for (Comparable<T> comp : comps) {
            if (comp.getComparableValue().compareTo(max.getComparableValue()) > 0) {
                max = comp;
            }
        }
        return max;
    }
}
