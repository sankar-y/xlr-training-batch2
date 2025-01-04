import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        // Declare variables
        String name;
        int age;
        long phno;

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Prompt and read name
        System.out.println("Please enter your name:");
        name = sc.nextLine();

        // Prompt and read age
        System.out.println("Please enter your age:");
        age = sc.nextInt();

        // Prompt and read phone number
        System.out.println("Please enter your phone number:");
        phno = sc.nextLong();

        // Display the collected information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phno);

        // Close the Scanner
        sc.close();
    }
}
