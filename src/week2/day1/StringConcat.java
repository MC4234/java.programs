package week2.day1;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     String a, b, c;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter first string:");
	        a = s.nextLine();
	        System.out.print("Enter second string:");
	        b = s.nextLine();
	      
	        c = a.concat(b);
	        System.out.println("New String:"+c);
	        
	       // Write a program to trim the String : " She sells sea shells on the sea shore ".
	String t= "     She sells sea shells on the sea shore   ";
	String p =t.trim();
	System.out.println("trimmed string is"+p);
	
	//Write a program to replace character ‘P’ with ‘F’ in the String:“Pan Pun Prank Pit Pat”
			
	String name = "Pan Pun Prank Pit Pat";
	String replaceString=name.replace('P','f');//replaces all occurrences of 'p' to 'f'  
	System.out.println(replaceString);  
	
	
	}
	
	    
}
		


