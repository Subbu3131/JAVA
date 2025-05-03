import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Enter Your Name: ");
        name = input.nextLine();
        System.out.println("Enter Your Age: ");
        age = input.nextInt();
        input.nextLine(); // Consume newline

        System.out.println("GREAT!");
        System.out.println("Nice to meet you, " + name + "! 👋");
        System.out.println("You're " + age + " years old — welcome aboard! Hope you're having a great day! 😊");

        input.close();
    }
}
