import java.util.Scanner;

public class Temperatureconverterusingternaryopearator 
{
  public static void main(String[] args)
  {
    Scanner scanner=new Scanner(System.in);

    System.out.print("Enter the temperature: ");
    double temp=scanner.nextDouble();

    System.out.print("Convert the temperature to: ");
    String unit=scanner.next();


    double result= (unit.equalsIgnoreCase("C"))? ((temp-32)*(5.0/9.0)):(temp*(9.0/5.0)+32);

    System.out.printf("%.2f°%s",result,unit.toUpperCase());

    scanner.close();
  }
}
