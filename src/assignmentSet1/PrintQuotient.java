package assignmentSet1;

import java.util.Scanner;

public class PrintQuotient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float firstNum,secondNum,quotient,remainder  ;
		System.out.println("Enter the first number");
		Scanner s= new Scanner(System.in);
		firstNum =s.nextFloat();
		System.out.println("Enter the second number");
		secondNum =s.nextFloat();
		quotient = (firstNum/secondNum);
		remainder = (firstNum%secondNum);
		System.out.println("Quotiont of the number"+quotient);
		System.out.println("Remainder of the number"+remainder);

	}

}
