import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get the birth year from the user
    System.out.print("Enter your birth year: ");
    int birthYear = scanner.nextInt();

    // Get the current year
    int currentYear = LocalDate.now().getYear();

    // Calculate the age
    int age = currentYear - birthYear;

    // Display the result
    System.out.println("Your age is: " + age + " years");

    // Close the scanner
    scanner.close();
  }
}
