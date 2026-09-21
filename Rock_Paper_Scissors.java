import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissors 
{
  public static void main(String[] args)
  {
    Scanner scanner=new Scanner(System.in);
    Random random=new Random();

    System.out.print("\nEnter your choice (rock, paper, scissors): ");
    String choice=scanner.next();
    choice=choice.toLowerCase();

    if (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors")) 
    {
      System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
    }
    else
    {
      System.out.print("The computer plays: ");
      int computerChoice=random.nextInt(1,4);

      switch (computerChoice) 
      {
        case 1:
          System.out.println("rock");
          break;
        case 2:
          System.out.println("paper");
          break;
        case 3:
          System.out.println("scissors");
          break;
      }

      if(choice.equals("rock") && computerChoice==1)
      {
        System.out.println("It's a tie!");
      }
      else if(choice.equals("rock") && computerChoice==2)
      {
        System.out.println("You lose!");
      }
      else if(choice.equals("rock") && computerChoice==3)
      {
        System.out.println("You win!");
      }
      else if(choice.equals("paper") && computerChoice==1)
      {
        System.out.println("You win!");
      }
      else if(choice.equals("paper") && computerChoice==2)
      {
        System.out.println("It's a tie!");
      }
      else if(choice.equals("paper") && computerChoice==3)
      {
        System.out.println("You lose!");
      }
      else if(choice.equals("scissors") && computerChoice==1)
      {
        System.out.println("You lose!");
      }
      else if(choice.equals("scissors") && computerChoice==2)
      {
        System.out.println("You win!");
      }
      else if(choice.equals("scissors") && computerChoice==3)
      {
        System.out.println("It's a tie!");
      }
    }
    scanner.close();
  }
}
