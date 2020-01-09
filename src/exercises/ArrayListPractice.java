package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Double> numbs = new ArrayList<>();
        for (int i=1; i<11; i++) {
            numbs.add((double) i);
        }
        Double evenNumbs = SumArrayList.sumEvenNumbs(numbs);
        System.out.println(evenNumbs);

        ArrayList<String> names = new ArrayList<>();
        names.add("Basketball");
        names.add("Cooler");
        names.add("Sodas");
        names.add("Bacon");
        names.add("Spencer");

        printNames(names);
    }

    public static void printNames (ArrayList<String> names) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length of the name");
        int nameLength = input.nextInt();
        for (String name : names) {
            if (name.length() == nameLength) {
                System.out.println(name);
            }
        }
    }
}
