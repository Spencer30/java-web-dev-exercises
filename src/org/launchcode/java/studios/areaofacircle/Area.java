package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double rad;
        do {
            System.out.println("Enter a radius: ");
            while(!input.hasNextDouble()){
                System.out.println("That is NOT a number");
                System.out.println("Enter a POSITIVE number");
                input.next();
            }
            rad = input.nextDouble();
        } while (rad <= 0);

        Double answer = Circle.getArea(rad);
        System.out.println(answer);

    }
}
