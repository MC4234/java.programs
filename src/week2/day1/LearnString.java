/*1. Write your name and reverse it
2. Find no.of 'a' in the string "amazon India"
3. Write a program to concatenate 2 strings.
4. Write a program to trim the String : " She sells sea shells on the sea shore ".
5. Write a program to replace character ‘P’ with ‘F’ in the String:
“Pan Pun Prank Pit Pat”*/

package week2.day1;

public class LearnString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String name="MNO xyz";
	int len=name.length();
	//length of the string
	System.out.println(name.length());
	//reverse String
	String reverseString = "";
	int endValue= len-1;
	System.out.println(endValue);
	for(int i = endValue; i >= 0; i--)
	 {
	 reverseString = reverseString + name.charAt(i);
	 }
	 
	 System.out.println("Reversed string is:");
	 System.out.println(reverseString);
	 
	

}
}