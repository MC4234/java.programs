package week4.day1;

public class MyMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile myMobile = new Mobile();
		System.out.println("calling"+ myMobile.mobileNum);
		myMobile.callMobile();
		boolean result = myMobile.isConnected();
		System.out.println(result);
		
		Telephone tel = new Mobile();
	 tel.callMobile();
	 boolean res =tel.isConnected();
	 System.out.println(res);
		
		
		
		
	}

}
