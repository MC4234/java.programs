/* Java Program to calculate average of number using Array */ 
package assignmentSet1;

public class FindAverage {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] arr = new int[] {0,1,2,3,4,5};
		//int[] arr = {0,1,2,3,4,5};
		
		int arr[] = {1, 5, 7, 8};
		//int arr[] = {1,2,3,4,5};
		
		int n =arr.length;
		float sum = 0;
		float avg=0;
		System.out.println("Length of the array is: " +n);

		System.out.println("Print the array:");
		for(int i =0;i<n;i++)
		{
			System.out.println(arr[i]);
					}
		
	
		for(int j= 0;j<n;j++)
		{
			
			sum = sum + arr[j];
			avg =sum/n;
			
		}
		System.out.println("Sum of the array:"+sum);
		System.out.println("Avearge:"+avg);
			
	
	}

}
