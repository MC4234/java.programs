/*1. Write your name and reverse it
2. Find no.of 'a' in the string "amazon India"
3. Write a program to concatenate 2 strings.
4. Write a program to trim the String : " She sells sea shells on the sea shore ".
5. Write a program to replace character ‘P’ with ‘F’ in the String:
“Pan Pun Prank Pit Pat”*/
package week2.day1;

public class StringFunc 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Merris Mary Chacko";
		  int count = 0;
		  char[] individualChar = name.toCharArray();
		  System.out.println("Repeated Characters are:");
		  for (int i = 0; i < name.length(); i++) {
		   for (int j = i + 1; j < name.length(); j++)
		   {
		    if (individualChar[i] == individualChar[j])
		    {
		     System.out.println(individualChar[j]);
		     count++;
		     
		    }
		   }
		  // System.out.println("no of times repeated"+count);
		  }
	}

}
