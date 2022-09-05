


public class TypeConversionDemo1 {

	public static void main(String[] args) {
	double num1=12.5;
	int num2=10;
	double result=num1+num2;
	System.out.println(result); //22.5
	//int result2=num1+num2;  //Type mismatch: cannot convert from double to int
    // Because the size of int datatype is of 4 bytes and that of double is of 8 bytes. So 8 bytes cannot be accomodated
	// into 4 bytes of memory
	}

}
