package task1.day2;

public class Mobile {

		long mobNum;
		String name;
		

			
public Mobile()
		{
			this.name ="m";
		}
public Mobile(int num)
{
	this.mobNum= 9876543210l;
}
 
		public long callByMobile()
		{ 
			return mobNum;
			
		}
		
		public String callByName()
		{
			return "name";
		}
		
	/*public String checkConnection(String con) 
	{
			if(con.equals("5G")) {
				System.out.println("Connection is 5G");
				
			}
			else {
				return con;			
			}
		}*/
		
}




/*TODO - 2:
1. Write a class Mobile
2. Write a method to call someone using number
3. Wtite a methods to call someone by name
4. Write a method to check if the phone has 5g
5. Write a main method and call all the method and execute*/


