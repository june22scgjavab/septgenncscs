
public class NestedLoopDemo1 {

	/*1
	 *12 
	 *123 
	 *1234 
	 *12345 
	 */
	
	public static void main(String[] args) {
		int i=5;
	
		for(int row=1;row<=i;row++)
		{
			for(int col=1;col<=row;col++)
			{
			System.out.print(col);
			}
			System.out.print("\n");
			}
		
	}

}
