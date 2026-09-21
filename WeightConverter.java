import java.util.Scanner;

public class WeightConverter 
{
  public static void main(String[] args)
  {
    Scanner scanner=new Scanner(System.in);

    System.out.print("1)If you'd like to convert lbs to kgs select 1\n2)If you'd like to convert kgs to lbs select 2\nUser Input: ");
    int choice=scanner.nextInt();

    if(choice==1)
    {
      System.out.print("Enter the weight in lbs: ");
      double lbs=scanner.nextDouble();

      double kgs= (lbs/2.205);

      System.out.printf("The weight in kgs is %.2f",kgs);
    }
    else if(choice==2)
    {
      System.out.print("Enter the weight in kgs: ");
      double kgs=scanner.nextDouble();

      double lbs= kgs*2.205;

      System.out.printf("The wight in kgs is %.2f",lbs);
    }
    else
    {
      System.out.println("Invalid user input");
    }

    scanner.close();
  }
  
}
