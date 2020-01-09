package exercises;

import java.util.Scanner;

public class CalcArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        Double length = input.nextDouble();
        System.out.println("What is the width of the rectangle?");
        Double width = input.nextDouble();
        System.out.println("Area of rectangle is: " + length * width);
    }
}
