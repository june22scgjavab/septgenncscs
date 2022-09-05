import java.util.Scanner;

// We need to add the values of all the even numbers and also we need to count the number of even numbers
public class ContinueDemo {

	public static void main(String[] args) {
	  Scanner scanner=new Scanner(System.in);
	  int number;
	  int addEven=0;
	  int countEven=0;
	  for(int ctr=1;ctr<=10;ctr++) {
		  System.out.println("Enter the number");
		  number=scanner.nextInt();
		  if((number%2)!=0) {  // If the number entered is not even , we can go to the next iteration which means we don't want to execute line 17 and 18
			  continue;
		  }
		  addEven=addEven+number;
		  countEven++;
	  }
	  System.out.println("The total count of even numbers out of 10 "+countEven);
	  System.out.println("The sum of even numbers "+addEven);
	}

}
