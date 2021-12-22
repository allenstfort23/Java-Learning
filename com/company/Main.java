package com.company;

import java.awt.*;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        // Pointers
        Point point1 = new Point( 1, 1);
        Point point2 = point1;
        point1.x = 2;
        String message = " Hello World" + "!! ";
        message.endsWith("!!");
        // Arrays
        // To set up arrays
        int[] setOfNumbers1 = new int[5];
        // To put values into the array that is declared.
        setOfNumbers1[0] = 1;
        setOfNumbers1[1] = 2;

        // Current way arrays are set up.
        int[] setOfNumbers2 = {3,4,5,6};

        // To set up a Multi-dimensional array
        int [][] setOfNumber3 = {{1,2,3}, {4,5,6}};

        // Constants
        final float pi = 3.14F;

        System.out.println("This is a Multi-dimensional array: " + Arrays.deepToString(setOfNumber3));
        System.out.println("This is the length of the array2: " + setOfNumbers2.length);

        System.out.println(Arrays.toString(setOfNumbers2));

    }
}
