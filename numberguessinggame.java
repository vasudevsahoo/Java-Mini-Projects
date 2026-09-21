import java.util.Scanner;
import java.util.Random;

public class numberguessinggame 
{
  public static void main(String[] args)
  {
    Scanner scanner=new Scanner(System.in);
    Random random=new Random();

    int target=random.nextInt(1,11);
    int num;

    do
    {
      System.out.print("Guess a number between 0 and 11: ");
      num=scanner.nextInt();

      if(num<target)
      {
        System.out.println("Guess higher");
      }
      else if (num>target)
      {
        System.out.println("Guess lower");
      }
      else
      {
        System.out.println("You've guessed the number correctly. Congratulations!");
      }
    }while(num!=target);
    


    /* while(num!=target)
    {
      System.out.println("Wrong guess. Try again!");
      System.out.print("Guess a number between 0 and 11: ");
      num=scanner.nextInt();
    
    }
    System.out.println("You've guessed the number correctly. Congratulations!");
    */
    scanner.close();
  }
  
}
