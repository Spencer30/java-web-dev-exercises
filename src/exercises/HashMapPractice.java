package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newID;
        String name;


        System.out.println("Enter your students (or Press Enter to finish):");
        do {

            System.out.print("Name: ");

            name = input.nextLine();

            if (!name.equals("")) {
                System.out.print("ID: ");
                newID = input.nextInt();
                students.put(newID, name);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!name.equals(""));


        // Print class roster
        System.out.println("\nClass roster:");


        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }
}
