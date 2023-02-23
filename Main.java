import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static HashMap<String, ArrayList<Student>> classes = new HashMap<String, ArrayList<Student>>();
    public static void main(String[]args) {
        System.out.println("Hello! Welcome to the Grade Manager!");

        while (true) {
            System.out.println("Please choose one of the following:");
            System.out.println("1: Enter a class");
            System.out.println("2: Create a class");
            System.out.println("3: View your classes");
            System.out.println("0: Exit Program");
            System.out.print("Please enter a number from 1-3: ");

            try {
                int choice = input.nextInt();

                System.out.println();

                if (choice == 2) {
                    createClass();
                } else if (choice == 3) {
                    for (String a : classes.keySet()) {
                        System.out.println(a);
                    }
                } else if (choice == 0) {
                    System.out.println("Thanks for using our program!");
                    break;
                } else {
                    System.out.println("This is not a valid option!");
                    System.out.println("Please enter a valid option!");
                }
            } catch (Exception e) {
                System.out.println();
                System.out.println("This is not a valid option!");
                System.out.println("Please enter a valid option");
                System.out.println();
                input.next();
                continue;
            }

            System.out.println();
        }
    }

    public static void createClass() {
        System.out.print("Enter course code: ");
        String courseCode = input.next();

        ArrayList<Student> classList = new ArrayList<Student>();

        classes.put(courseCode, classList);

        System.out.println();
        System.out.println("Class " + courseCode + " created!");
    }
}