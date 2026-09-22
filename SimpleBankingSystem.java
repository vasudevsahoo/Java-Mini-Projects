import java.util.Scanner;

public class SimpleBankingSystem
{
  public static void main(String[] args)
  {
    Scanner scanner=new Scanner(System.in);

    int i;
    String perform_action;
    int a;
    int x;
    int a1;

    System.out.print("How many total accounts would you like to create: ");
    int n=scanner.nextInt();
    int[] account_id=new int[n];

    System.out.print("What is the intial account in each account: ");
    int initial_money=scanner.nextInt();
    for (i=1;i<n;i++)
    {
      account_id[i]=initial_money;
    }

    Boolean running=true;

    while(running)
    {

      perform_action=scanner.nextLine();

      switch (perform_action)
      {
        case "deposit":
          System.out.print("Enter account number: ");
          a=scanner.nextInt();
          System.out.print("Enter amount to be deposited: ");
          x=scanner.nextInt();
          deposit(account_id,a,x);
          break;
        
        case "withdraw":
          System.out.print("Enter account number: ");
          a=scanner.nextInt();
          System.out.print("Enter amount to be withdrawn: ");
          x=scanner.nextInt();
          withdraw(account_id,a,x);
          break;

        case "transfer":
          System.out.print("Enter sender account number: ");
          a=scanner.nextInt();
          System.out.print("Enter amount to be transferred: ");
          x=scanner.nextInt();
          System.out.print("Enter receiver account number: ");
          a1=scanner.nextInt();
          transfer(account_id,a,x,a1);
          break;
        
        case "balance":
          System.out.print("Enter account number: ");
          a=scanner.nextInt();
          balance(account_id, a);
          break;
      }
    }
    scanner.close();
  }

  static void deposit(int[] accountid,int a,int x)
  {
    accountid[a]+=x;
    System.out.printf("Deposited %d INR to Account-%d\n",x,a);
  }

  static void withdraw(int[] accountid,int a,int x)
  {
    if((accountid[a]-=x)<0)
    {
      System.out.println("Insuffient balance");
    }
    else
    {
      accountid[a]-=x;
      System.out.printf("%d INR has been withdrawn from Account-%d\n",x,a);
    }
  }

  static void transfer(int[] accountid,int a,int x,int a1)
  {
    if((accountid[a]-=x)<0)
    {
      System.out.println("Insuffient balance");
    }
    else
    {
      accountid[a]-=x;
      accountid[a1]+=x;
      System.out.printf("Transferred %d INR from Account-%d to Account-%d\n",x,a,a1);
    }
  }

  static void balance(int[] accountid,int a)
  {
    System.out.printf("Available Balance in Account-%d is %d INR\n",a,accountid[a]);
  }
}