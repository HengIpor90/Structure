package shop;
import java.util.Scanner;
public class shop {
    Scanner scanner = new Scanner(System.in);
    public void input(){
        System.out.println("Input method called");
        String Item ;
        double Price ;
        double quantity ;
        char currency = '$';
        double total;
        System.out.println("Welcome to the Shopping Cart Application!");
        
        System.out.print("Enter the item name: ");
        Item = scanner.nextLine();
        System.out.println(Item);

        System.out.print("Enter the price of the item: ");
        Price = scanner.nextDouble();
        System.out.println(Price);

        System.out.print("Enter the quantity: ");
        quantity = scanner.nextDouble();
        System.out.println(quantity);
        
        total = Price * quantity;
        System.out.println("Total cost: " + currency + total);

        scanner.close();
    }
}
