import java.util.Scanner;

public class UserInputDemo1 {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);     
		   System.out.println("Enter a number");
		   int num=sc.nextInt();  // This executable line with scanner.nextInt() is helping to accept user input and store it in the 
		      // variable num;
		   System.out.println("Enter a name");
		   String name=sc.next();
		   System.out.println(num);
		   System.out.println(name); 

	}

}
