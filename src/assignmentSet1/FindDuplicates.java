/*6. 
 12, 32, 12, 45, 65, 93, 0, 23, 45, 68*/
package assignmentSet1;

public class FindDuplicates {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int arr[]= {12, 32, 12, 45, 65, 93, 0, 23,0,45, 6};
	int len =arr.length;
	System.out.println("Length of the array:"+len);
	//int num[7];
	int num[] = new int[len+1];
	int var[] = new int[len+1];
	
	for (int i = 0; i < len; i++)
	{ 
		for (int j = i + 1 ; j < len; j++) 
	{
		if (arr[i]== arr[j])
		{
			//num=arr[i];
			System.out.println(arr[i]+"is getting repeated");
		}
			
		
	}
	}
	

	
	
	
	

}
}