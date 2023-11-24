import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num = -1;
    do {
      // Get the name and birth date from the user
      System.out.print("Enter your name: ");
      String name = scanner.next();
      System.out.println("Hello " + name + "!");
      System.out.print("Enter your birth date (YYYY-MM-DD): ");
      String birthDateStr = scanner.next();

      // Parse the input string into a LocalDate object
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
      LocalDate birthDate = LocalDate.parse(birthDateStr, formatter);

      // Get the current date
      LocalDate currentDate = LocalDate.now();

      // Calculate the age
      Period age = calculateAge(birthDate, currentDate);

      // Display the result
      System.out.println(
          "Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days");

      // Ask the user if they want to repeat the process
      System.out.print("Enter 1 to calculate age again, or any other number to exit: ");
      num = scanner.nextInt();

    } while (num == 1);

    // Close the scanner
    scanner.close();
  }

  // Calculate age method
  private static Period calculateAge(LocalDate birthDate, LocalDate currentDate) {
    return Period.between(birthDate, currentDate);
  }
}
