package com.javalab10.interfaces.model;

import com.javalab10.interfaces.common.Comparable;

/**
 * Represents a cow with a name and weight.
 * This class implements the Comparable interface to allow comparison between cows based on their weight.
 * The weight is already a Double, making it directly comparable with other objects.
 */
public class Cow implements Comparable<Double> {
    // The cow's name
    private String name;
    // The cow's weight in kilograms
    private double weight;

    /**
     * Creates a new Cow with the specified name and weight.
     * 
     * @param name The cow's name (e.g., "Bessie", "Daisy")
     * @param weight The cow's weight in kilograms (must be positive)
     */
    public Cow(String name, double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        }
        this.name = name;
        this.weight = weight;
    }

    /**
     * Gets the cow's name.
     * @return The cow's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the cow's weight.
     * @return The cow's weight in kilograms
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Returns the cow's weight for comparison purposes.
     * This method is used when comparing cows with other objects.
     * 
     * @return The cow's weight as a Double
     */
    @Override
    public Double getComparableValue() {
        return weight;
    }

    /**
     * Returns a string representation of the cow.
     * Format: "name (weight: X kg)"
     * 
     * @return A string describing the cow
     */
    @Override
    public String toString() {
        return name + " (weight: " + weight + " kg)";
    }
}
