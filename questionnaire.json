import java.util.Scanner;

public class Questionnaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Questionnaire!");
        System.out.println("Please answer the following questions:");

        // Ask the user questions
        String name = askQuestion("What is your name?", scanner);
        int age = Integer.parseInt(askQuestion("How old are you?", scanner));
        String favoriteColor = askQuestion("What is your favorite color?", scanner);

        // Generate a response at the end
        System.out.println("Thank you for answering the questions!");
        System.out.println("Here is your summary:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favorite Color: " + favoriteColor);

        // Close the scanner
        scanner.close();
    }

    private static String askQuestion(String question, Scanner scanner) {
        System.out.println(question);
        return scanner.nextLine();
    }
}
