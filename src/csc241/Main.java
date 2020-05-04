package csc241;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Instantiate a new ArrayList
        List<Integer> myList = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Print the elements
        System.out.println("---=== Before ===---");
        myList.forEach( i -> System.out.println(i));

        // Remove
        myList.removeIf(i -> i > 7);

        System.out.println("---=== After     ===---");
        myList.forEach( i -> System.out.println(i));

    }
}
