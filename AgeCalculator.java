import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get the birth date from the user
    System.out.print("Enter your birth date (YYYY-MM-DD): ");
    String birthDateStr = scanner.next();

    // Parse the input string into a LocalDate object
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate birthDate = LocalDate.parse(birthDateStr, formatter);

    // Get the current date
    LocalDate currentDate = LocalDate.now();

    // Calculate the age
    int age = calculateAge(birthDate, currentDate);

    // Display the result
    System.out.println("Your age is: " + age + " years");

    // Close the scanner
    scanner.close();
  }

  // Calculate age method
  private static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
    int age = currentDate.getYear() - birthDate.getYear();

    // Adjust age if birthdate has not occurred yet this year
    if (currentDate.getMonthValue() < birthDate.getMonthValue()
        || (currentDate.getMonthValue() == birthDate.getMonthValue()
            && currentDate.getDayOfMonth() < birthDate.getDayOfMonth())) {
      age--;
    }

    return age;
  }
}
