import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter ur choice");
		
		int choice=scan.nextInt();
	
	switch(choice) {
	case 1 : System.out.println("Sunday!!!!");
	         break;
	case 2 : System.out.println("Monday!!!!!");
	         break;
	default : System.out.println("Your option is wrong!!!!!!");
	         
	}

	}

}
