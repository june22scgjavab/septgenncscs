package package3;
//Importing the Scanner class
import java.util.Scanner;
public class Customer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Creating a Scanner object
		int totalCost = 0;
		String wantToAddFoodItem;
		int unitPrice = 10;
		int quantity = 1;
		do {
			totalCost = totalCost + (quantity * unitPrice);
			System.out.println("Order placed successfully!");
			System.out.println("Total cost: " + totalCost);
			System.out.println("Do you want to add more food items to the order? Y or N");
			 wantToAddFoodItem = sc.next(); 
		
		} while (wantToAddFoodItem.equalsIgnoreCase("Yes"));
		System.out.println("Thank you for ordering the food! It will reach you shortly...");
	}
}
