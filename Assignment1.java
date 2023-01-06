import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) { 
      Scanner input = new Scanner(System.in);
    // Prompt the user to enter an email address
    System.out.print("Enter an email address: ");
    String email = input.nextLine();

    // Define a regular expression for email addresses
    String regex = "\\w+@students.national-u.edu.ph"; 

    // Compile the regular expression
    Pattern pattern = Pattern.compile(regex);

    // Check if the email address is a valid format
    Matcher matcher = pattern.matcher(email);
    if (matcher.matches()) {
      System.out.println("Valid email address");
    } else {
      System.out.println("Invalid email address");
    }
  }
}
