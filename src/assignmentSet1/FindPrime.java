 /*Is 13 a prime number ?*/

package assignmentSet1;

public class FindPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =13;
		float div=0;
		for(int i=2;i<=num;i++)
		{
			div = num/i;
		
			if(div==num)
			
			{
				System.out.println(num+ "is prime");
			}
			else
			{
				System.out.println(num+ "is not prime");
			}
		
		}
		
	}

}
