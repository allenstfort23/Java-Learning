package com.company;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;


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

        // To use double in equations
        double result = (double)10 / (double)3;

//        System.out.println("This is a Multi-dimensional array: " + Arrays.deepToString(setOfNumber3));
//        System.out.println("This is the length of the array2: " + setOfNumbers2.length);
//
//        System.out.println(Arrays.toString(setOfNumbers2));


        //Implicit Casting
        // byte > short > int > long > float > double
        double x = 1.1; // short type are 2 bytes.
        int y = (int)x + 2; // int types are 4 bytes. The result is 3.

        // wrapper class
        String w = "1";
        int v = Integer.parseInt(w) + 2;

        // The Math Class
        int roundedNumber = Math.round(1.1F); // 1
        int number = (int)Math.ceil(2.9F); // 3
        int number2 = (int)Math.floor(2.9F); // 2
        int number3 = Math.max(4,2);
        double randomNumberDouble = Math.random() * 100;

        // Explicit Casting
        int randomWholeNumber = (int)Math.round(Math.random() * 100);
        int randomWholeNumber2 = (int)(Math.random() * 100);
        //System.out.println(randomWholeNumber2);

        //Number Formatting
        // NumberFormat currency = new NumberFormat(); // can not create an instance of the number clas because it's abstract. There is a better way, following line of code.

        /* Long way to write the method out.
        NumberFormat currency1 = NumberFormat.getCurrencyInstance(); // This is called a factory method.
        String amount = currency1.format(1234567.891);
        System.out.println(amount);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentage = percent.format(0.1);
        System.out.println(percentage);
        */

        // Short way to write out the method out from above.

        /*
        String percent = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(percent);
        */

        // Reading Input
        Scanner scanner = new Scanner(System.in); // To read for the terminal.
        System.out.print("Please Enter Your Age: ");
        byte age= scanner.nextByte();
        System.out.println("You are: " + age);

        System.out.print("Please Enter Your Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Your name is: " + name);
    }
}
