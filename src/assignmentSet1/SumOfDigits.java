/*Find the sum of digits
Example:
int n = 1234;
output: 10 */

package assignmentSet1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1234;
		int sum =0;
		int mod;
		while(num >0) {
			mod=num%10;
			sum=sum+mod;
			num=num/10;
			
		}
		System.out.println("Sum of the digit: "+sum);
	}

}
