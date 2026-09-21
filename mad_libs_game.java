import java.util.Scanner;

public class mad_libs_game 
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    String adjective1;
    String noun1;
    String adjective2;
    String verb1;
    String adjective3;

    System.out.print("\nEnter an adjective: ");
    adjective1 = scanner.next();

    System.out.print("Enter a noun: ");
    noun1 = scanner.next();

    System.out.print("Enter an adjective: ");
    adjective2 = scanner.next();

    System.out.print("Enter an verb: ");
    verb1 = scanner.next();

    System.out.print("Enter an adjective: ");
    adjective3 = scanner.next();

    System.out.println("\nWelcome to the Mad Libs Game!");

    System.out.println("\nToday i went to a "+adjective1+" zoo.");
    System.out.println("In an exhibit, I saw "+noun1+".");
    System.out.println(noun1+" was "+adjective2+" and was "+verb1+" all over the place.");
    System.out.println("I was "+ adjective3+" to see "+noun1+" in the zoo.\n");

    scanner.close();
  }
}
