import java.util.Scanner;

public class Shopping_cart 
{
  public static void main(String[] args)
  {
    Scanner scanner=new Scanner(System.in);
    
    System.out.print("\nHow many items would you like to buy: ");
    int number_of_items=scanner.nextInt();
    scanner.nextLine();

    double total_bill=0;

    for(int i=1;i<=number_of_items;i++)
    {

      System.out.print("\nItem Name (Pizza, Burger, Fries, Coke): ");
      String item_name=scanner.next();
      item_name = item_name.toLowerCase();

      switch (item_name) 
      {
        case "pizza":
          double price_pizza=10.99;
          System.out.println("Price of Pizza: $"+price_pizza); 
          System.out.print("How many pizzas would you like to buy: ");
          int quantity=scanner.nextInt();
          double pizza_total_cost=quantity*price_pizza;
          System.out.printf("Total cost for pizzas: $%.2f\n", pizza_total_cost);
          total_bill += pizza_total_cost;
          break;
        case "burger":
          double price_burger=4.99;
          System.out.println("Price of Burger: $"+price_burger);
          System.out.print("How many burgers would you like to buy: ");
          quantity=scanner.nextInt();
          double burger_total_cost=quantity*price_burger;
          System.out.printf("Total cost for burgers: $%.2f\n", burger_total_cost);
          total_bill += burger_total_cost;
          break;
        case "fries":
          double price_fries=2.99;
          System.out.println("Price of Fries: $"+price_fries);
          System.out.print("How many fries would you like to buy: ");
          quantity=scanner.nextInt();
          double fries_total_cost=quantity*price_fries;
          System.out.printf("Total cost for Fries: $%.2f\n", fries_total_cost);
          total_bill += fries_total_cost;
          break;
        case "coke":
          double price_coke=1.99;
          System.out.println("Price of Coke: $"+price_coke);
          System.out.print("How many Cokes would you like to buy: ");
          quantity=scanner.nextInt();
          double coke_total_cost=quantity*price_coke;
          System.out.printf("Total cost for Cokes: $%.2f\n", coke_total_cost);
          total_bill += coke_total_cost;
          break;
        default:
          System.out.println("Unavailable item. Please choose from Pizza, Burger, Fries, or Coke.");
          break;
      }
    }
    System.out.printf("\nYour total bill is: $%.2f\n\n", total_bill);

    scanner.close();
  }
  
}
