import java.util.Scanner;

public class WhileDemo1 {

	public static void main(String[] args) {
		int num;
		Scanner scan=new Scanner(System.in);
        String reply="yes"; // STEP1 ===> initialisation of a variable
        // based on which it will be decided to enter a loop or not
        // In line 12 we are checking and deciding whether the value
        // of the variable is yes or not,if yes it will enter the loop
        while(reply.equalsIgnoreCase("yes"))  // STEP 2====> Condition check
        {
         System.out.println("Enter the number");
         num=scan.nextInt();
         System.out.println("The entered number is "+num);
         System.out.println("Do u want to continue?");
        reply=scan.next(); // STEP 3====> re-initialisation of the variable
         // to decide whether to be inside the loop or to move outside the 
         // loop
        }
	}

}
