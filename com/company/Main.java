package com.company;

import java.awt.*;


public class Main {

    public static void main(String[] args) {
        // Pointers
        Point point1 = new Point( 1, 1);
        Point point2 = point1;
        point1.x = 2;
        String message = " Hello World" + "!! ";
        message.endsWith("!!");
        System.out.println(message.trim());
        System.out.println(message);

    }
}
