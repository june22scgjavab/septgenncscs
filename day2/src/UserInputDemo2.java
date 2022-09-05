import java.util.Scanner;

public class UserInputDemo2 {
// Ctrl+Shift+o
	public static void main(String[] args) {
	int studentRoll;  // int primitive
	String studentName;  // non primitive/reference type
	float studentAverageScore; // float primitive
	Scanner scan=new Scanner(System.in); // non primitive/reference type
	System.out.println("Enter the student's roll number");
	studentRoll=scan.nextInt();
	System.out.println("Enter the student's name");
	studentName=scan.next();
	System.out.println("Enter the student's average score");
	studentAverageScore=scan.nextFloat();
	System.out.println("The details of the student:");
	System.out.println("ROLL "+studentRoll);
	System.out.println("NAME "+studentName);
	System.out.println("AVERAGE SCORE "+studentAverageScore);
	

	}

}
