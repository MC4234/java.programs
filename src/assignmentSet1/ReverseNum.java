/*Reverse a number*/

package assignmentSet1;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234;
		int sum =0;
		int mod;
		while(num >0) {
			mod=num%10;
			System.out.print(mod);
			sum=sum+mod;
			num=num/10;
			
		}
		

	}

}
