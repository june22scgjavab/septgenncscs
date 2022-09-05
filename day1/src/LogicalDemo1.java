

public class LogicalDemo1 {

	public static void main(String[] args) {
		int num1=100;
		int num2=30;
		int num3=20;
		System.out.println(num1>num2 && num1>num3);//true
		System.out.println(num2>num3 && num2>num1);//false
		System.out.println(num2>num3 || num2>num1);//true

	}

}
