package com.javalab10.interfaces;

import com.javalab10.interfaces.model.Person;
import com.javalab10.interfaces.model.Cow;
import com.javalab10.interfaces.common.Comparable;
import java.util.List;
import java.util.Arrays;

/**
 * Main class demonstrating the use of the Comparable interface.
 * This class shows how different objects (Person and Cow) can be compared
 * using a common interface, even though they compare different attributes
 * (age for Person, weight for Cow).
 */
public class Main {
    /**
     * Main method demonstrating comparison of different objects implementing Comparable<Double>.
     * Creates sample Person and Cow objects and compares them in different groups.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create sample people with different ages
         Person youngPerson = new Person("Tony", 25);  // Alice is 25 years old
         Person olderPerson = new Person("Patrick", 30);    // Bob is 30 years old

        // Create sample cows with different weights
        Cow heavyCow = new Cow("Booba", 500.0);  // Bessie weighs 500 kg
        Cow lighterCow = new Cow("Tokyio", 450.0); // Daisy weighs 450 kg

         // First, let's compare people by age
        System.out.println("\n=== Comparing People by Age ===");
        displayMaxValue("The oldest person is", Arrays.asList(youngPerson, olderPerson));

        // Next, let's compare cows by weight
        System.out.println("\n=== Comparing Cows by Weight ===");
        displayMaxValue("The heaviest cow is", Arrays.asList(heavyCow, lighterCow));

          // Finally, let's compare all objects together
        // This works because both Person and Cow implement Comparable<Double>
        System.out.println("\n=== Comparing All Objects Together ===");
        List<Comparable<Double>> allObjects = Arrays.asList(youngPerson, olderPerson, heavyCow, lighterCow);
        displayMaxValue("The object with the maximum value is", allObjects);
        System.out.println("\n");
    }

      /**
     * Generic method to find and display the maximum value from a list of Comparable objects.
     * This method can work with any objects that implement our Comparable interface.
     * 
     * @param message The message to display before the result
     * @param items The list of items to compare
     * @param <T> The type of objects being compared (must implement Comparable<Double>)
     * @throws IllegalArgumentException if the list is null or empty
      */
     private static <T extends Comparable<Double>> void displayMaxValue(String message, List<T> items) {
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("List of items cannot be null or empty");
        }

        // Convert the list to an array and find the maximum value
        @SuppressWarnings("unchecked")
        Comparable<Double>[] array = items.toArray(new Comparable[0]);
         @SuppressWarnings("unchecked")
        T maxItem = (T) Comparable.max(array);
        
        // Display the result with the provided message
        System.out.println(message + ": " + maxItem);
    }
}
