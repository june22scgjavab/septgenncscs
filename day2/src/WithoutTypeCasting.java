
public class WithoutTypeCasting {
	public static void main(String[] args) {
		int discountPercentage = 10;
		double totalPrice = 200;
		System.out.println((double)discountPercentage/100);
		double priceAfterDiscount = totalPrice * (1 - ((double)discountPercentage / 100));
		System.out.println("Customer has paid a bill of amount: "+ priceAfterDiscount);
	}

}
