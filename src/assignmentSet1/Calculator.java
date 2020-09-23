package assignmentSet1;

import task1.day2.Mobile;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CalFunction obj1 =new CalFunction();
		int sum=obj1.add();
		obj1.div(100,10);
		System.out.println("sum is "+sum);
		obj1.sub(100,1);
		obj1.mul(5,5);
		
	}

}

