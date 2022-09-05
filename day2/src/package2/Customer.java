package package2;
//Importing the Scanner class
import java.util.Scanner;
public class Customer {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);
		int totalCost = 0;
		String wantToAddFoodItem = "yes";
		int unitPrice = 10;
		int quantity = 1;
		while (wantToAddFoodItem .equalsIgnoreCase("yes")) {
			totalCost = totalCost + (quantity * unitPrice);
			System.out.println("Order placed successfully");
			System.out.println("Total cost: " + totalCost);
			System.out.println("Do you want to add more food items to your order? Yes or No");
			wantToAddFoodItem  = sc.next(); 
		
		}
	}
}
