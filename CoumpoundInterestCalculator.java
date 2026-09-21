import java.util.Scanner;

public class CoumpoundInterestCalculator 
{
  public static void main(String[] args)
  {
    Scanner scanner=new Scanner(System.in);

    System.out.print("Enter the principle amount: ");
    Double P=scanner.nextDouble();

    System.out.print("Enter the rate of interest (in %): ");
    Double R=(scanner.nextDouble()/100);

    System.out.print("Enter the number of times the amount is compounded per year: "); 
    int N=scanner.nextInt();

    System.out.print("Enter the number of years: ");
    Double T=scanner.nextDouble();

    double A=P*(Math.pow(1+(R/N),(N*T)));

    System.out.printf("The total ammount of money after %.2f year/years is $%.2f\n",T,A);

    double CI=A-P;

    System.out.printf("The coumpound interest is $%.2f",CI);

    scanner.close();

  }
}