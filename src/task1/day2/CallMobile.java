package task1.day2;

public class CallMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
	 
		Mobile mc =new Mobile();
		Mobile mc1 =new Mobile();
		Mobile mc2 =new Mobile();
		mc1.callByMobile();
		mc1.callByMobile();
		//String cont = "5g";
		long mob= mc.callByMobile();
		
		System.out.println("calling mobile number:");
		
		String name= mc.callByName();
		System.out.println("calling"+name);
	   // mc.checkConnection(cont);
		System.out.println("Connection is 5g");
		

	}

}
