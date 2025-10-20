import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        // TODO: Ask the user how many items they are purchasing
        Scanner sc = new Scanner(System.in);
        System.out.print("How many items are you purchasing? ");
        int numberOfItems = sc.nextInt();
        // TODO: Use a for loop to read each item's price (double)
        double sumOfItems = 0;
        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print("Price of item " + i + "? ");
            double price = sc.nextDouble();
            sumOfItems += price;
        }
        // TODO: Accumulate the total cost
        // TODO: Print the final summary line with item count and total
        System.out.println("Your cart has " + numberOfItems + " with a total cost of $" + sumOfItems);
        // TODO: Use Scanner for input
    }
}
