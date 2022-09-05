
import java.util.Scanner;
public class BreakDemo {

     public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int noOfIterations=10;
      int ctr=1;
      int num;
      int sum=0;
      while(ctr<=noOfIterations){
       System.out.println("Enter the number");
       num=scan.nextInt();
       sum=sum+num;      
       if(num==0){
           break;
       }
      ctr++;
    }
    System.out.println("The sum of entered numbers "+sum);
  }
}
