
public class TypeCasetingDemo2 {

	public static void main(String[] args) {
       int num1=5;
       int num2=2;
       int result=num1/num2;
       System.out.println(result); //2 But we want to see 2.5
       double result2=num1/num2;
       System.out.println(result2); //2.0 But we want to see 2.5
       double result3=(double)num1/num2;
       System.out.println(result3); //2.5

	}

}
