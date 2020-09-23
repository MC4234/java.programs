package assignmentSet1;

public class CalFunction {
	
	
	int a,b;
	public CalFunction()
	{
		 a=100;
		 b=100;
	}
	public CalFunction(float x,float y)
	{
		 x=x;
	     y=y;
	}

	
	public int add()
	{
		int sum = a+b;
		return sum;
		
	}

	public void div(float x, float y)
	{
		float div = x/y;
		System.out.println(x+"/"+y+ "=" +div);
		
	}
	public void sub(int m,int n)
	{
		int sub= m-n;
		System.out.println(m+"-"+n+ "=" +sub);
	}
	public void mul(int i, int j)
	{
		int mul =i *j;
		System.out.println(i+"*"+j+ "=" +mul);
	}
	
}
