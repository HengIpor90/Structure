package statements;

import java.util.Scanner;

public class get {
    Scanner scanner = new Scanner(System.in);

    public void input() {
        int age;
        String name;
        boolean isStudent;

        System.out.println("Input method called");

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();
        
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
        }
        else {
            System.out.println("Name entered: " + name);
        }

        if (age < 0) {
            System.out.println("Invalid age entered.");
        } else if (age == 0) {
            System.out.println("You are a newborn.");
        } else if (age >= 65) {
            System.out.println("You are a senior citizen.");
        } else if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a child.");
        }

        
        if (isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }
    }
}
