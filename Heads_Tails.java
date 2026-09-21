import java.util.Random;

public class Heads_Tails 
{
  public static void main(String[] args)
  {
    Random random=new Random();

    int choice=random.nextInt(2);

    if (choice==0)
    {
      System.out.println("\nHeads\n");
    }
    else
    {
      System.out.println("\nTails\n");
    }

    /*

    boolean choice=random.nextBoolean();

    if (choice==true)
    {
      System.out.println("\nHeads\n");
    }
    else
    {
      System.out.println("\nTails\n");
    }

    */

  }
}

