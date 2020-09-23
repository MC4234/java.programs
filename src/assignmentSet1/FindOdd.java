/* Find all the odd numbers from 79 to 187*/

package assignmentSet1;

public class FindOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNum = 79;
		int lastNum = 187;
		int oddNum =0;
		System.out.println("Print numbers between 79 and 189");
		for(int i=firstNum;i<=lastNum;i++) {
			
			System.out.println(i);
			
		}
		System.out.println("Odd number");
		for(int j=firstNum;j<=lastNum;j++)
		{
			 oddNum =j%2;
					if(oddNum!=0)
					{
						System.out.println(j);
					}
		

	}

}
}
