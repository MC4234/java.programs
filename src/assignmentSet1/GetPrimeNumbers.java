package assignmentSet1;

import java.util.Scanner;

public class GetPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum,secondNum;
		String primeNumbersFound = "";
		
		Scanner s= new Scanner(System.in);
		int[] arr= new int[100];
		int div=0;
		int p=0;
		int i;
		boolean isPrime = true;
		
		System.out.println("Enter the first number");
    	firstNum =s.nextInt();
    	
		System.out.println("Enter the second number");
		secondNum =s.nextInt();
		
		  for (i = firstNum; i <= secondNum; i++) {
	            isPrime = CheckPrime(i);
	            if (isPrime) {
	                primeNumbersFound = primeNumbersFound + i + " ";
	            }
	        }
	        System.out.println("Prime numbers from" +firstNum + "to"  + secondNum + " are:");
	        // Print prime numbers from 1 to maxCheck
	        System.out.println(primeNumbersFound);
	}
	    public static boolean CheckPrime(int numberToCheck) 
	    {
	    	
		     int remainder;
		        for (int i = 2; i <= numberToCheck / 2; i++)
		        {
		            remainder = numberToCheck % i;
		            
		            if (remainder == 0) {
		                return false;
		            }
		        }
		        return true;
		 
		    }
	    
	  
    
	
}
