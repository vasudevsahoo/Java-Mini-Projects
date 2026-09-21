
import java.util.Scanner;

public class Basic_Calculator 
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("\nEnter the first number: ");
    double num1 = scanner.nextDouble();

    System.out.print("\nEnter the second number: ");
    double num2 = scanner.nextDouble();

    System.out.print("\nWould you like to perform all the operations or a specific operation? (Enter 'all' or 'specific'): ");
    String choice = scanner.next();

    if (choice.equalsIgnoreCase("all"))
    {
      System.out.printf("\nSum: %.2f\n", (num1 + num2));
      System.out.printf("Difference: %.2f\n", (num1 - num2));
      System.out.printf("Product: %.2f\n", (num1 * num2));
      System.out.printf("Power: %.2f\n", Math.pow(num1, num2));
      if (num2 != 0) 
      {
        System.out.printf("Quotient: %.2f\n", (num1 / num2));
        System.out.printf("Integer Quotient: %d\n", (int)(num1 / num2));
        System.out.printf("Remainder: %.2f\n", (num1 % num2));
      } 
      else 
      {
        System.out.println("\nError: Division by zero is not allowed.");
      }
    }

    else if (choice.equalsIgnoreCase("specific")) 
    {
      System.out.print("\nEnter the operation to be performed (+, -, *, /, %, //, ^): ");
      String operation = scanner.next();

      switch (operation) 
      {
        case "+":
          System.out.printf("\nSum: %.2f\n", (num1 + num2));
          break;
        case "-":
          System.out.printf("\nDifference: %.2f\n", (num1 - num2));
          break;
        case "*":
          System.out.printf("\nProduct: %.2f\n", (num1 * num2));
          break;
        case "/":
          if (num2 != 0) 
          {
            System.out.printf("\nQuotient: %.2f\n", (num1 / num2));
          } 
          else 
          {
            System.out.println("\nError: Division by zero is not allowed.");
          }
        case "//":
          if (num2 != 0) 
          {
            System.out.printf("\nInteger Quotient: %d\n", (int)(num1 / num2));
          } 
          else 
          {
            System.out.println("\nError: Division by zero is not allowed.");
          }
          break;
        case "%":
          if (num2 != 0) 
          {
            System.out.printf("\nRemainder: %.2f\n", (num1 % num2));
          } 
          else 
          {
            System.out.println("\nError: Division by zero is not allowed.");
          }
          break;
        case "^":
          System.out.printf("\nPower: %.2f\n", Math.pow(num1, num2));
          break;
        default:
          System.out.println("\nError: Invalid operation.");
      }
    } 
    else 
    {
      System.out.println("\nError: Invalid choice. Please enter 'all' or 'specific'.");
    }

    scanner.close();
  }
  /* x++ is possible in java but ++x is not possible in java.
  java follows the bodmas rules
  python and java are different*/
}