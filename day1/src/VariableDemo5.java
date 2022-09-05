

public class VariableDemo5 {

	public static void main(String[] args) {
		//float f=12.5; // compilation error
		// Why compilation error because here 12.5 is treated as
		// double and not as float
		float data=12.5f; // put the suffix f or F
		float data2=12.5F;
		System.out.println(data);
		System.out.println(data2);
		double d1=12.3;// 12.3 is a double value assignned to double
		//variable
		float data3=12; // 12 is an int value , int can be stored in a float variable
       double d2=12; //12 is int and can be assigned to double as the
       // size of int is 32bits and size of double is 64bits
	}

}
